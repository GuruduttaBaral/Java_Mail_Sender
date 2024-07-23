package com.jsp.boot_email.dto;


public class Email_Details {
	
	private String to;
	private String subject;
	private String body;
	private String attachment;
	@Override
	public String toString() {
		return "Email_Details [to=" + to + ", subject=" + subject + ", body=" + body + ", attachment=" + attachment
				+ "]";
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
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public Email_Details() {
		super();
	}
	
	
	
}
