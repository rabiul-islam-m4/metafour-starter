package com.metafour.starter.model;

import java.util.Date;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	private String id;
	@NotEmpty
	private String name;
	@NotEmpty
	private String fathername;
	@NotNull
	private Date dateOfBirth;
	@NotEmpty
	private String gender;
	@NotNull
	private Boolean married;
	private String contactnumber;
	private String nid;
	private String email;
	private String district;
	private String thana;
	private String post;
	private String vill;
	private String raod;
	private String hoseNo;
	private String psdistrict;
	private String psthana;
	private String pspost;
	private String psvill;
	private String psraod;
	private String pshoseNo;
	private String educationalLabel;
	private String institute;
	private String subject;
	private String result;
	private String passingYear;
	private String boardOrUni;
	private String[] planguage;

	public String[] getPlanguage() {
		return planguage;
	}

	public void setPlanguage(String[] planguage) {
		this.planguage = planguage;
	}

	public String getPsdistrict() {
		return psdistrict;
	}

	public void setPsdistrict(String psdistrict) {
		this.psdistrict = psdistrict;
	}

	public String getPsthana() {
		return psthana;
	}

	public void setPsthana(String psthana) {
		this.psthana = psthana;
	}

	public String getPspost() {
		return pspost;
	}

	public void setPspost(String pspost) {
		this.pspost = pspost;
	}

	public String getPsvill() {
		return psvill;
	}

	public void setPsvill(String psvill) {
		this.psvill = psvill;
	}

	public String getPsraod() {
		return psraod;
	}

	public void setPsraod(String psraod) {
		this.psraod = psraod;
	}

	public String getPshoseNo() {
		return pshoseNo;
	}

	public void setPshoseNo(String pshoseNo) {
		this.pshoseNo = pshoseNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getMarried() {
		return married;
	}

	public void setMarried(Boolean married) {
		this.married = married;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getThana() {
		return thana;
	}

	public void setThana(String thana) {
		this.thana = thana;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getVill() {
		return vill;
	}

	public void setVill(String vill) {
		this.vill = vill;
	}

	public String getRaod() {
		return raod;
	}

	public void setRaod(String raod) {
		this.raod = raod;
	}

	public String getHoseNo() {
		return hoseNo;
	}

	public void setHoseNo(String hoseNo) {
		this.hoseNo = hoseNo;
	}

	public String getEducationalLabel() {
		return educationalLabel;
	}

	public void setEducationalLabel(String educationalLabel) {
		this.educationalLabel = educationalLabel;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(String passingYear) {
		this.passingYear = passingYear;
	}

	public String getBoardOrUni() {
		return boardOrUni;
	}

	public void setBoardOrUni(String boardOrUni) {
		this.boardOrUni = boardOrUni;
	}
}
