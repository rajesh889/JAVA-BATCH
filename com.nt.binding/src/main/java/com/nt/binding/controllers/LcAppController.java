package com.nt.binding.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LcAppController {

 @RequestMapping("/")
 public String showHomePage() {
	 return "home-page";
 }
 
}
