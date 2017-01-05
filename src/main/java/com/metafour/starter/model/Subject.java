package com.metafour.starter.model;

/**
 * @author Noor Siddique
 * @since 26 Dec 2016
 *
 */
public class Subject {
	private String subjectcode;
	private String subjectdescription;

	public Subject(String subjectcode, String subjectdescription) {
		this.subjectcode = subjectcode;
		this.subjectdescription = subjectdescription;
	}
	public String getSubjectcode() {
		return subjectcode;
	}

	public void setSubjectcode(String subjectcode) {
		this.subjectcode = subjectcode;
	}

	public String getSubjectdescription() {
		return subjectdescription;
	}

	public void setSubjectdescription(String subjectdescription) {
		this.subjectdescription = subjectdescription;
	}
}
