package com.green.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


// @Controller + @RequestMapping : .jsp, .mustache를 찾고
// @Controller + @RequestMapping + responseBody : .jsp, .mustache를 찾지 않고 data를 출력한다 : 새로운 페이지에
//@Controller + responseBody : @RestController
// 모든 함수에 @REsponseBody 가 적용된다.
// @Controller : view 파일을 리턴하고
// @RestController : data 를 리턴한다.
@Controller
public class MvcController {

	@RequestMapping("/mvc")
	public String mvc(Model model) {
		
		model.addAttribute("username", "카리나");
		return "mvc";
	}
	
	@RequestMapping("/ajax1")
	public String ajax1() {
		String username = "카리나";
		return username;
	}
	
	@RequestMapping("/ajax2")
	@ResponseBody
	public String ajax2() {
		String username = "<h2>카리나</h2>";
		return username;
	}
}
