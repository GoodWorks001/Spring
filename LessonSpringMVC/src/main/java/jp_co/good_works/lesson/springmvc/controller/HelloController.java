package jp_co.good_works.lesson.springmvc.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//このファイルはコントローラーですよ。という宣言　MVCモデルで今回作成しているので記載は必須。
@Controller
public class HelloController {
	
	// /helloとアクセスされたら　下記 helloメソッドが実行される。
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(Model model) {
		//modelという箱にmessageというなの名前でHelloSpringという文字列を格納している
		model.addAttribute("message", "Hello, Spring!" );
		// hello.jspへ遷移する。
		return "hello";
	}
	
}
