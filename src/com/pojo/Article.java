package com.pojo;

/**
 * Article entity. @author MyEclipse Persistence Tools
 */

public class Article implements java.io.Serializable {

	// Fields

	private Integer articleId;
	private Category category;
	private String articleName;
	private String articleDesc;
	private String articlePic;
	private String articleContent;

	// Constructors

	/** default constructor */
	public Article() {
	}

	/** minimal constructor */
	public Article(Integer articleId) {
		this.articleId = articleId;
	}

	/** full constructor */
	public Article(Integer articleId, Category category, String articleName,
			String articleDesc, String articlePic, String articleContent) {
		this.articleId = articleId;
		this.category = category;
		this.articleName = articleName;
		this.articleDesc = articleDesc;
		this.articlePic = articlePic;
		this.articleContent = articleContent;
	}

	// Property accessors

	public Integer getArticleId() {
		return this.articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getArticleName() {
		return this.articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getArticleDesc() {
		return this.articleDesc;
	}

	public void setArticleDesc(String articleDesc) {
		this.articleDesc = articleDesc;
	}

	public String getArticlePic() {
		return this.articlePic;
	}

	public void setArticlePic(String articlePic) {
		this.articlePic = articlePic;
	}

	public String getArticleContent() {
		return this.articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

}