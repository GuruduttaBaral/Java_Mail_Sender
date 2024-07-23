package com.jsp.boot_email.dto;

public class Email_Mul {
	String[] email; 
	String subject;
	String template;
	@Override
	public String toString() {
		return "Email_Mul [email=" + email + ", subject=" + subject + ", template=" + template + "]";
	}
	public String[] getEmail() {
		return email;
	}
	public void setEmail(String[] email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	
	

}
