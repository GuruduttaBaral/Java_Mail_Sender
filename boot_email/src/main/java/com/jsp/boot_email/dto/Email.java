package com.jsp.boot_email.dto;


public class Email {
	
	String to;
	String subject;
	String body;
	@Override
	public String toString() {
		return "Email [to=" + to + ", subject=" + subject + ", body=" + body + "]";
	}
	
	public Email() {
		super();
	}

	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
}
