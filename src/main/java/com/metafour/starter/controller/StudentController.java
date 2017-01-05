package com.metafour.starter.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.metafour.starter.exception.MetafourStarterException;
import com.metafour.starter.model.Person;
import com.metafour.starter.model.Student;
import com.metafour.starter.service.DestinationService;
import com.metafour.starter.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	private final Map<String, String> SKILL = new HashMap<>();
	@Autowired StudentService studentService;
	@Autowired DestinationService destinationService;
	
	
	{
		SKILL.put("JAV", "Java");
		SKILL.put("PHP", "PHP");
		SKILL.put("JCP", "JavaScript");
		SKILL.put("C", "C");
		SKILL.put("PYT", "Python");
		SKILL.put("SQL", "SQL");
		SKILL.put("ORA", "Oracle");
		
	}
	/*@PostConstruct
	private void init() {
		SKILL.put("JAV", "Java");
		SKILL.put("PHP", "PHP");
		SKILL.put("JCP", "JavaScript");
		SKILL.put("C", "C");
		SKILL.put("PYT", "Python");
		SKILL.put("SQL", "SQL");
		SKILL.put("ORA", "Oracle");
	}*/
	
	@RequestMapping(method=RequestMethod.GET)
	public String newScreen(final ModelMap model) throws MetafourStarterException {
		return updateScreen(null, model);
	}

	@RequestMapping("/{id}")
	public String updateScreen(@PathVariable String id, final ModelMap model) throws MetafourStarterException {
		model.addAttribute("student", id == null ? new Student() : studentService.getById(id));
	    model.addAttribute("elbels", Arrays.asList("SSC", "HSC", "Graduation", "Post Graduation"));
	    model.addAttribute("languages", SKILL);
		return "student/student";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> addNewStudent(@Valid Student student, BindingResult binding, final ModelMap model) throws MetafourStarterException, BindException {
		Map<String, String> result = new HashMap<>();
		if (binding.hasErrors()) throw new BindException(binding);
		if (student.getId() == null || studentService.getById(student.getId()) == null)
			studentService.addStudent(student);
		else
			studentService.updateStudent(student);

		result.put("status", "success");
		result.put("redirect", "/" + student.getId());
		return result;
	}
}
