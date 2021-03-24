package com.sbs.untact.dto;

public class Article {
	private int id;
	private String regData;
	private String title;
	private String body;

	public Article(int id, String regData, String title, String body) {
		this.id = id;
		this.regData = regData;
		this.title= title;
		this.body= body;
		
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", regData=" + regData + ", title=" + title + ", body=" + body + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegData() {
		return regData;
	}

	public void setRegData(String regData) {
		this.regData = regData;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
