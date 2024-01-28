package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;

@Controller
public class HelloWorldController {

 @RequestMapping("/")
 public String hello(Model model) {
	 model.addAttribute("hello", "Hello!Jenkinsを使用してAmazon ECSへのCI/CDパイプラインを実現できました！！");
     return "hello";
 }
}