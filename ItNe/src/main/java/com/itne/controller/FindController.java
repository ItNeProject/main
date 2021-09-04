package com.itne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itne.service.FindService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class FindController {
	public FindService findServie;
	
	/** 아이디 찾기 페이지로 이동 */
	@RequestMapping("findIdForm")
	public String findIdForm() {
		return "user/findIdForm";
	}
	

	/** 아이디 찾기 */
	@RequestMapping("findId")
	public String findId(String phone, Model model) {
		String id = findServie.findId(phone);
		if (id == null) {
			model.addAttribute("message", "입력한 정보로 찾을 수 있는 아이디가 없습니다.");
			return "user/findIdForm";
		}
		model.addAttribute("message", "아이디: " + id);
		return "user/loginForm";
	}

	/** 비밀번호 찾기 페이지로 이동 */	
	@RequestMapping("findPwForm")
	public String findPwForm() {
		return "user/findPwForm";
	}
	

	/** 비밀번호찾기 */
	@RequestMapping("findPw")
	public String findPw(String id, String phone, Model model) {
		String pwd = findServie.findPw(id, phone);
		if (pwd == null) {
			model.addAttribute("message", "계정정보를 확인 후 다시 시도해주세요.");
			return "user/findPwForm";
		}
		model.addAttribute("message", "비밀번호: " + pwd);
		return "user/loginForm";
	}
	
	

}
