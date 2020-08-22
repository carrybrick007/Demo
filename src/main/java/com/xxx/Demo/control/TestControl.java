package com.xxx.Demo.control;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.Demo.model.UserVO;
import com.xxx.Demo.utils.MyFile;

@RestController
@RequestMapping("hello")
@CrossOrigin
public class TestControl {
	@RequestMapping(value="/getMessage",method=RequestMethod.GET,produces = "application/json;charset=UTF-8")
	public String getMessage(String message) {
		System.out.println(message);
		System.out.println();
		return "helloworld "+message;

	}
	@RequestMapping(value="/setMessage",method=RequestMethod.POST,produces = "application/json;charset=UTF-8")
	public UserVO getMessage2(@RequestBody UserVO userVo,@RequestParam String par) {
		System.out.println(userVo);
		System.out.println(par);
		//return "helloworld "+userVo.getAge()+userVo.getName()+userVo.getSex()+" "+par;
		return userVo;

	}
	@RequestMapping(value="/saveMessage",method=RequestMethod.POST)
	public String saveMessage( @RequestParam String message,@RequestParam String fileName) {
		System.out.println(fileName);
		System.out.println(message);
		MyFile.writeFile("D:/file/"+fileName+".bpmn", message);
		//return "helloworld "+userVo.getAge()+userVo.getName()+userVo.getSex()+" "+par;
		return "0";

	}
}
