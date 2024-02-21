package com.example.perct.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/control")
public class Controller {

	@PostMapping
	public String displayPerct(@RequestParam String data,int sub1,int sub2, int sub3,int sub4,int sub5)
	{
		
		double pect=((sub1+sub2+sub3+sub4+sub5)/500.0)*100.0;
		
		return data+" percatage is "+pect+"%";
	}
}
