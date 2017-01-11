package com.sudhir.MybootApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@RequestMapping("/hi")
 public String getHello(){
	 return "hi";
 }
}
