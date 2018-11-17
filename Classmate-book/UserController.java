package com.example.taoxiao;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.apache.poi.*;

@RestController 
@RequestMapping("/android")  
public class UserController {
	@Autowired
	private userMapper user;
	
	@RequestMapping("/show")
	public List<user> showuser(){
		return user.show();
	}
	
	@RequestMapping("/select")
	public List<user> selectuser(String name){
		return user.select(name);
	}
	
	@RequestMapping("/new")
	public String newuser(String name,String address,String phonenumber,String wechat,String email,String qq,String word){
		if(user.insert(name,address,phonenumber,wechat,email,qq,word))
			return "用户创建成功";
		else
			return "用户创建失败";
	}
	@RequestMapping("/update")
	public String updateuser(String name,String address,String phonenumber,String wechat,String email,String qq,String word){
		if(user.update(name,address,phonenumber,wechat,email,qq,word))
			return "用户修改成功";
		else
			return "用户修改失败";
	}
	@RequestMapping("/delete")
	public String deleteuser(String name){
		if(user.delete(name))
			return "用户创建成功";
		else
			return "用户创建失败";
	}
}
