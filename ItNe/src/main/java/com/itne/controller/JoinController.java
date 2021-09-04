package com.itne.controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itne.dto.User;
import com.itne.service.JoinService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class JoinController {
	public JoinService joinService;

	/** 회원가입페이지로 이동 */
	@RequestMapping("/user/joinForm")
	public String joinForm(Model model, HttpSession session) {
		return "user/joinForm";
	}

	/** 회원가입 */
	@RequestMapping("/user/join")
	public String join(User dto, Model model) {
		int result = joinService.addUser(dto);
		if (result == 1) {
			model.addAttribute("message", "[회원가입성공] 로그인 후 서비스 이용하세요");
			return "user/loginForm";
		} else {
			model.addAttribute("message", "[회원가입실패] 가입 정보를 다시 확인하시기 바랍니다.");
			return "user/joinForm";
		}
	}
	
	/** 아이디 중복체크 */
	@RequestMapping("/user/checkId")
	@ResponseBody
	public int checkId(String userId) {
		return joinService.checkId(userId);	
	}


}
