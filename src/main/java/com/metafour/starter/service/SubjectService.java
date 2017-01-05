package com.metafour.starter.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.metafour.starter.model.Destination;
import com.metafour.starter.model.Subject;

/**
 * @author Noor Siddique
 * @since 26 Dec 2016
 *
 */
@Service
public class SubjectService {
	private List<Subject> subjects = new ArrayList<>();

	@PostConstruct
	private void init() {
		subjects.add(new Subject("BAN", "Bangla"));
		subjects.add(new Subject("ENG", "English"));
		subjects.add(new Subject("MAT", "Math"));
		subjects.add(new Subject("ACC", "Accounting"));
		subjects.add(new Subject("PSY", "Psychology"));
		subjects.add(new Subject("SSC", "Social Science"));
		subjects.add(new Subject("HIS", "Histry"));
		subjects.add(new Subject("GEO", "Geography"));
		subjects.add(new Subject("COM", "Computer Science"));
	}

	public List<Subject> getAll() {
		return subjects;
	}

	public List<Subject> findBy(String hint) {
		return hint.equals("?") ? subjects : subjects.stream().filter(d -> d.getSubjectcode().toLowerCase().contains(hint.toLowerCase()) || d.getSubjectdescription().toLowerCase().contains(hint.toLowerCase())).collect(Collectors.toList());
	}
}
