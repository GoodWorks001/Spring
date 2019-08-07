package jp_co.good_works.lesson.springmvc.form;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

public class UserInfoForm {
	
	@NotEmpty
	private String name;
	@NotEmpty
	private String age;
	private String gender;
	@NotEmpty
	private String email;
	@NotEmpty
	private String birthplace;
	@NotEmpty
	private String etc;
	
	private List<String>favoliteLangs;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	public List<String> getFavoliteLangs() {
		return favoliteLangs;
	}
	public void setFavoliteLangs(List<String> favoliteLangs) {
		this.favoliteLangs = favoliteLangs;
	}

	
}
