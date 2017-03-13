package com.pojo;

/**
 * Link entity. @author MyEclipse Persistence Tools
 */

public class Link implements java.io.Serializable {

	// Fields

	private Integer linkId;
	private String linkHref;
	private String linkName;

	// Constructors

	/** default constructor */
	public Link() {
	}

	/** minimal constructor */
	public Link(Integer linkId) {
		this.linkId = linkId;
	}

	/** full constructor */
	public Link(Integer linkId, String linkHref, String linkName) {
		this.linkId = linkId;
		this.linkHref = linkHref;
		this.linkName = linkName;
	}

	// Property accessors

	public Integer getLinkId() {
		return this.linkId;
	}

	public void setLinkId(Integer linkId) {
		this.linkId = linkId;
	}

	public String getLinkHref() {
		return this.linkHref;
	}

	public void setLinkHref(String linkHref) {
		this.linkHref = linkHref;
	}

	public String getLinkName() {
		return this.linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

}