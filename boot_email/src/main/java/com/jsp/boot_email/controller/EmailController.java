package com.jsp.boot_email.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.boot_email.dto.Email;
import com.jsp.boot_email.dto.Email_Details;
import com.jsp.boot_email.dto.Email_Mul;
import com.jsp.boot_email.service.EmailService;

@RestController
public class EmailController {
	@Autowired
	EmailService service;
	@GetMapping("/msg")
	public String msg() {
		return "hii";
	}
//	@PostMapping("/send")
//	public void sendMsg(@RequestBody Email email) {
//		System.out.println(email);
//	}
	@PostMapping("/send")
	public String SendMessage(@RequestBody  Email email) {
		try {
			service.sendMsg(email);
			return "msg send sucessfully";
		}
		catch(Exception e) {
			e.printStackTrace();
			return "Internal issue try again";
		}
	}
	@PostMapping("/sendAll")
	public String SendMessageAll(@RequestBody  Email_Mul email) {
		try {
			service.sendAllMsg(email);
			return "msg send sucessfully";
		}
		catch(Exception e) {
			e.printStackTrace();
			return "Internal issue try again";
		}
	}
	@PostMapping("/sendHtml")
	public String sendHtmlMail() {
		try {
			service.sendHtmlEmail();
			return "mail send sucessfully";
		}
		catch(Exception e) {
			return "technical issue";
		}
	}
	@PostMapping("/sendMailIWith")
	public String sendEmailWithAttach(@RequestBody Email_Details email) {
		try {
			service.sendEmailWithAttachment(email);
			return "mail send sucessfully";
		}
		catch(Exception e) {
			return "technical issue";
		}
	}
}
