package com.sudhir.MybootApp.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HomeController {
@RequestMapping("/hi")
 public String getHello(){
	 return "hi sudhir";
 }
}
