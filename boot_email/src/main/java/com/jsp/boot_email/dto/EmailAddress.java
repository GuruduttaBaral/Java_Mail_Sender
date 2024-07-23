package com.jsp.boot_email.dto;

public class EmailAddress {
	String form;
	String reciepents;
	String subject;
	@Override
	public String toString() {
		return "EmailAddress [form=" + form + ", reciepents=" + reciepents + ", subject=" + subject + "]";
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getReciepents() {
		return reciepents;
	}
	public void setReciepents(String reciepents) {
		this.reciepents = reciepents;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
