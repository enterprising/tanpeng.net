package com.pojo;

import java.sql.Timestamp;

/**
 * Lunbotu entity. @author MyEclipse Persistence Tools
 */

public class Lunbotu implements java.io.Serializable {

	// Fields

	private Integer LId;
	private String LName;
	private String LTitle;
	private Timestamp LTime;
	private Integer LStatu;
	private String LLianjie;
	private String LContent;

	// Constructors

	/** default constructor */
	public Lunbotu() {
	}

	/** minimal constructor */
	public Lunbotu(Integer LId) {
		this.LId = LId;
	}

	/** full constructor */
	public Lunbotu(Integer LId, String LName, String LTitle, Timestamp LTime,
			Integer LStatu, String LLianjie, String LContent) {
		this.LId = LId;
		this.LName = LName;
		this.LTitle = LTitle;
		this.LTime = LTime;
		this.LStatu = LStatu;
		this.LLianjie = LLianjie;
		this.LContent = LContent;
	}

	// Property accessors

	public Integer getLId() {
		return this.LId;
	}

	public void setLId(Integer LId) {
		this.LId = LId;
	}

	public String getLName() {
		return this.LName;
	}

	public void setLName(String LName) {
		this.LName = LName;
	}

	public String getLTitle() {
		return this.LTitle;
	}

	public void setLTitle(String LTitle) {
		this.LTitle = LTitle;
	}

	public Timestamp getLTime() {
		return this.LTime;
	}

	public void setLTime(Timestamp LTime) {
		this.LTime = LTime;
	}

	public Integer getLStatu() {
		return this.LStatu;
	}

	public void setLStatu(Integer LStatu) {
		this.LStatu = LStatu;
	}

	public String getLLianjie() {
		return this.LLianjie;
	}

	public void setLLianjie(String LLianjie) {
		this.LLianjie = LLianjie;
	}

	public String getLContent() {
		return this.LContent;
	}

	public void setLContent(String LContent) {
		this.LContent = LContent;
	}

}