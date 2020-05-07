package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.awt.datatransfer.StringSelection;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

@RestController
@RequestMapping(path="/")
	public  class  DemoController {
@RequestMapping(value = "print/{msg}",method = RequestMethod.GET)
		public  String print (@PathVariable(value = "") String msg){

			return  "Hello From  "+msg;
		}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

	return  "{\"id\":1,\"content\":\"Hello, "+name+"!\"}";
	}


	}


}
