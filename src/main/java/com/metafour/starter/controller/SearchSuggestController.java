package com.metafour.starter.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metafour.starter.service.DestinationService;
import com.metafour.starter.service.PersonService;
import com.metafour.starter.service.ResortService;
import com.metafour.starter.service.StudentService;
import com.metafour.starter.service.SubjectService;

/**
 * @author Noor Siddique
 * @since 26 Dec 2016
 *
 */
@RestController
@RequestMapping("/search")
public class SearchSuggestController {
	
	@Autowired DestinationService destinationService;
	@Autowired SubjectService subjectService;
	@Autowired ResortService resortService;
	@Autowired PersonService personService;
	@Autowired StudentService studentService;

	@RequestMapping("/destination/{hint}")
	public Collection<Map<String, String>> searchDestination(@PathVariable String hint) {
		return destinationService.findBy(hint).stream().map(it -> {
			Map<String, String> item = new HashMap<>();
			item.put("key", it.getCode());
			item.put("value", it.getDescription());
			return item;
		}).collect(Collectors.toList());
	}
	
	@RequestMapping("/subject/{hint}")
	public Collection<Map<String, String>> searchSubject(@PathVariable String hint) {
		return subjectService.findBy(hint).stream().map(it -> {
			Map<String, String> item = new HashMap<>();
			item.put("key", it.getSubjectcode());
			item.put("value", it.getSubjectdescription());
			return item;
		}).collect(Collectors.toList());
	}
	@RequestMapping("/subjects/{hint}")
	public Collection<Map<String, String>> searchSubjects(@PathVariable String hint) {
		return searchSubject(hint);
	}
	@RequestMapping("/city/{hint}")
	public Collection<Map<String, String>> searchCity(@PathVariable String hint) {
		return searchDestination(hint);
	}
	
	@RequestMapping("/districts/{hint}")
	public Collection<Map<String, String>> searchDistrict(@PathVariable String hint) {
		return searchDestination(hint);
	}

	@RequestMapping("/resort/{hint}")
	public Collection<Map<String, String>> searchResort(@PathVariable String hint) {
		return resortService.find(hint).stream().map(it -> {
			Map<String, String> item = new HashMap<>();
			item.put("key", it.getCode());
			item.put("value", it.getDescription());
			return item;
		}).collect(Collectors.toList());
	}

	@RequestMapping("/person/{hint}")
	public Collection<Map<String, String>> searchPerson(@PathVariable String hint) {
		return personService.find(hint).stream().map(it -> {
			Map<String, String> item = new HashMap<>();
			item.put("key", it.getId());
			item.put("value", it.getName());
			return item;
		}).collect(Collectors.toList());
	}
	
	@RequestMapping("/student/{hint}")
	public Collection<Map<String, String>> searchStudent(@PathVariable String hint) {
		return studentService.find(hint).stream().map(it -> {
			Map<String, String> item = new HashMap<>();
			item.put("key", it.getId());
			item.put("value", it.getName());
			return item;
		}).collect(Collectors.toList());
	}
}
