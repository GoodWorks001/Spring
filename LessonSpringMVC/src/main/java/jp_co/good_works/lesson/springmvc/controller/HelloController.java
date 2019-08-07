package jp_co.good_works.lesson.springmvc.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//���̃t�@�C���̓R���g���[���[�ł���B�Ƃ����錾�@MVC���f���ō���쐬���Ă���̂ŋL�ڂ͕K�{�B
@Controller
public class HelloController {
	
	// /hello�ƃA�N�Z�X���ꂽ��@���L hello���\�b�h�����s�����B
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(Model model) {
		//model�Ƃ�������message�Ƃ����Ȃ̖��O��HelloSpring�Ƃ�����������i�[���Ă���
		model.addAttribute("message", "Hello, Spring!" );
		// hello.jsp�֑J�ڂ���B
		return "hello";
	}
	
}
