package com.china.gavin.entity;

/**
 * 图书
 * 
 * @author Luxh
 */
public class Book {

	private Integer id;

	/**
	 * 书名
	 */
	private String title;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 作者
	 */
	private String author;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
