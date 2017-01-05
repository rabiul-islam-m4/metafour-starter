package com.metafour.starter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.metafour.starter.exception.MetafourStarterException;
import com.metafour.starter.model.Student;




@Service
public class StudentService {
	List<Student> students=new ArrayList<>(); 
	
	public void addStudent(Student student) throws MetafourStarterException {
		student.setId(String.valueOf(new Random().nextLong()));
		students.add(student);
	}
	
	public void updateStudent(Student student) throws MetafourStarterException {
		List<Student> ssts = students.stream().filter(s -> s.getId().equals(student.getId())).collect(Collectors.toList());
		if (ssts.isEmpty())
			throw new MetafourStarterException("No Student found with ID '" + student.getId() + "' for update!");
		students.remove(ssts.get(0));
		students.add(student);
	}

	public void deleteStudent(Student student) throws MetafourStarterException {
		List<Student> ssts = students.stream().filter(s -> s.getId().equals(student.getId())).collect(Collectors.toList());
		if (ssts.isEmpty())
			throw new MetafourStarterException("No Student found with ID '" + student.getId() + "' for delete!");
		students.remove(ssts.get(0));
	}

	public List<Student> find(String hint) {
		return hint.equals("?") ? students : students.stream().filter(d -> d.getId().toLowerCase().contains(hint.toLowerCase()) || d.getName().toLowerCase().contains(hint.toLowerCase())).collect(Collectors.toList());
	}

	public Student getById(String id) throws MetafourStarterException {
		List<Student> ssts = students.stream().filter(s -> s.getId().equals(id)).collect(Collectors.toList());
		if (ssts.size() != 1)
			return null;
		return ssts.get(0);
	}

}