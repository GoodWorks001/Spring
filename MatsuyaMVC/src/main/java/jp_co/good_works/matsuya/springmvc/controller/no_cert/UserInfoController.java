package jp_co.good_works.matsuya.springmvc.controller.no_cert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp_co.good_works.matsuya.springmvc.form.UserInfoForm;

@Controller
@Scope("session")
public class UserInfoController {
	
	List<UserInfoForm> userInfoFormList = new ArrayList<UserInfoForm>();
	
	@RequestMapping(value={"/userinfo"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	public String userInfo(Model model) {
		
	UserInfoForm form = new UserInfoForm();

	List<String> genders =new ArrayList<String>();
	List<String> birthplace=new ArrayList<String>();
	List<String> favoriteLang=new ArrayList<String>();

	model.addAttribute("message","ユーザー情報を入力してください");
	model.addAttribute("UserInfoFormList",userInfoFormList);
	
	genders.add("男");
	genders.add("女");
	model.addAttribute("genders",genders);
	
	favoriteLang.add("食べる");
	favoriteLang.add("寝る");
	favoriteLang.add("旅行");
	favoriteLang.add("小説を読む");
	favoriteLang.add("料理を作る");
	favoriteLang.add("写真を撮る");
	model.addAttribute("favoriteLang",favoriteLang);

	
	birthplace.add("四川省");
	birthplace.add("黒竜江省");
	birthplace.add("北海道");
	birthplace.add("東北");
	birthplace.add("関東");
	birthplace.add("中部");
	birthplace.add("近畿");
	birthplace.add("九州");
	birthplace.add("四国");
	model.addAttribute("birthplace",birthplace);
	
	model.addAttribute("message","welcomeよ");
	model.addAttribute("userInfoForm",form);
	return "userinfo";
	}
	
	@RequestMapping(value={"/userinfo"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
	public String userInfo(Model model,@Validated @ModelAttribute UserInfoForm form, BindingResult result) {
		
		 List<String> genders= new ArrayList<String>();
	     List<String> birthplace = new ArrayList<String>();
	     List<String> favoriteLangs = new ArrayList<String>();
	     
	     
	     
	     genders.add("男");
	     genders.add("女");
	 	model.addAttribute("genders",genders);
	 	
		favoriteLangs.add("食べる");
		favoriteLangs.add("寝る");
		favoriteLangs.add("旅行");
		favoriteLangs.add("小説を読む");
		favoriteLangs.add("料理を作る");
		favoriteLangs.add("写真を撮る");
		model.addAttribute("favoriteLang",favoriteLangs);

	 	
		birthplace.add("四川省");
		birthplace.add("黒竜江省");
		birthplace.add("北海道");
		birthplace.add("東北");
		birthplace.add("関東");
		birthplace.add("中部");
		birthplace.add("近畿");
		birthplace.add("九州");
		birthplace.add("四国");
		model.addAttribute("birthplace",birthplace);

	 	if(result.hasErrors()) {
	 		 System.out.println("----------------");
	            System.out.println(result.getObjectName());
	            System.out.println("----------------");
	        } else
	        {
	            model.addAttribute("message", "welcomeよ");
	            this.userInfoFormList.add(form);
	        }
	        model.addAttribute("userInfoFormList", this.userInfoFormList);
	        model.addAttribute("userInfoForm", form);
	        return "userinfo";
	    }
	}

