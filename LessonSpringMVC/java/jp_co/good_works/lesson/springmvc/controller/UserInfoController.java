package jp_co.good_works.lesson.springmvc.controller;

import java.util.*;
			
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import jp_co.good_works.lesson.springmvc.form.UserInfoForm;

@Controller
@Scope("session")
public class UserInfoController {
		List<UserInfoForm> userInfoFormList = new ArrayList<UserInfoForm>();	
		@RequestMapping(value="/userinfo", method = RequestMethod.GET)
		public String userInfo(Model model) {
			UserInfoForm form = new UserInfoForm();
			List<String> genders = new ArrayList<String>();
			List<String> birthplaces = new ArrayList<String>();
			List<String> langs = new ArrayList<String>();
			model.addAttribute("UserInfoForm",form);
			
			genders.add("男性");
			genders.add("女性");
			model.addAttribute("genders",genders);
		
			birthplaces.add("");
			birthplaces.add("北海道");
			birthplaces.add("東北");
			birthplaces.add("関東");
			birthplaces.add("その他");
			model.addAttribute("birthplaces",birthplaces);
			langs.add("Java");
			langs.add("PHP");
			langs.add("Ruby");
			
			model.addAttribute("langs",langs);
			
			System.out.println("GETのControllerは終りましたよ。");
			return "userinfo";
			
		}
		
		
		@RequestMapping(value="/userinfo", method=RequestMethod.POST)
		public String userinfo (Model model,@Validated @ModelAttribute 
				UserInfoForm form,BindingResult result) {
		
			List<String> genders = new ArrayList<String>();
			List<String> birthplaces = new ArrayList<String>();
			List<String> langs = new ArrayList<String>();

			
			model.addAttribute("UserInfoForm",form);
			genders.add("男性");
			genders.add("女性");
			model.addAttribute("genders",genders);
			birthplaces.add("");
			birthplaces.add("北海道");
			birthplaces.add("東北");
			birthplaces.add("関東");
			birthplaces.add("その他");
			model.addAttribute("birthplaces",birthplaces);
			langs.add("Java");
			langs.add("PHP");
			langs.add("Ruby");
			System.out.println("POSTおわた");
			return "userinfo";
		}
	}

