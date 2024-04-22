package com.green.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.green.dto.UserDto;

// 이페이지는 전부 @ResponseBody 로 작동
// 1.데이터전송 표준  - soap protocol 방식 : xml
// 2.데이터전송 표준  - rest API  방식 : json/xml
@RestController
public class DataServerController {
	
	@RequestMapping("/ajax3")
	public String ajax3() {
		String username = "카리나";
		return username; // json 으로 변경되어 출력
	}
	
	//UserDto class 를 추가한 후 실행
	//자바객체 : new UserDto(userid, userpass, username);
	//jacksonbinder 라이브러리가 작동되어야함 
	//js객체 : {"userid": "karin", "userpass": "1234", "username": "카리나"}
	@RequestMapping("/ajax4")
	public UserDto ajax4() {
		String userid = "karin";
		String userpass = "1234";
		String username = "카리나";
		UserDto user = new UserDto(userid, userpass, username);
		return user; 
	}
}
