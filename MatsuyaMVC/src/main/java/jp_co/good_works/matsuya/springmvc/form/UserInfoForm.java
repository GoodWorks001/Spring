package jp_co.good_works.matsuya.springmvc.form;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class UserInfoForm {
	
    @NotEmpty
	private String name;
	@NotNull
	@Min(value=20L)
	private Integer age;
	
	private String gender;
	
	private String birthplace;
	
	private List<String>favoriteLangs;
	
	@Email
	private String mail;
	private String etc;
	
	  public Integer getAge()
	  {
	    return this.age;
	  }
	  
	  public void setAge(Integer age)
	  {
	    this.age = age;
	  }
	  
	  public String getEtc()
	  {
	    return this.etc;
	  }
	  
	  public String getBirthplace()
	  {
	    return this.birthplace;
	  }
	  
	  public void setBirthplace(String birthplace)
	  {
	    this.birthplace = birthplace;
	  }
	  
	  public void setEtc(String etc)
	  {
	    this.etc = etc;
	  }
	  
	  public String getMail()
	  {
	    return this.mail;
	  }
	  
	  public void setMail(String mail)
	  {
	    this.mail = mail;
	  }
	  
	  public String getName()
	  {
	    return this.name;
	  }
	  
	  public void setName(String name)
	  {
	    this.name = name;
	  }
	  
	  public String getGender()
	  {
	    return this.gender;
	  }
	  
	  public void setGender(String gender)
	  {
	    this.gender = gender;
	  }
	  
	  public List<String> getFavoriteLangs()
	  {
	    return this.favoriteLangs;
	  }
	  
	  public void setFavoriteLangs(List<String> favoriteLangs)
	  {
	    this.favoriteLangs = favoriteLangs;
	  }
	}
