package jp_co.good_works.lesson.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp_co.good_works.lesson.springmvc.form.ProductForm;


@Controller
@Scope("session")
public class ProductController {
	ProductForm form = new ProductForm();
	private List<ProductForm> productList = new ArrayList<ProductForm>();
	
	@RequestMapping(value="/product", method = RequestMethod.GET)
	public String product(Model model) {
		model.addAttribute("message","���i������͂��Ă�������");
		model.addAttribute("productForm",form);
		return "product";	
	}
	@RequestMapping(value ="/product" , method = RequestMethod.POST)
	public String product(Model model,@Validated @ModelAttribute ProductForm form , BindingResult result) {
		if(result.hasErrors()) {
			model.addAttribute("message","�G���[������܂�");
		}else {
		model.addAttribute("message" , "���i��񂪓��͂���܂���");
		productList.add(form);
		}
		model.addAttribute("productForm",form);
		model.addAttribute("productList",productList);
		return "product";

	}
}