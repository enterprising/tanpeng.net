package com.pojo;

/**
 * Message entity. @author MyEclipse Persistence Tools
 */

public class Message implements java.io.Serializable {

	// Fields

	private Integer messageId;
	private String messageName;
	private String mesageMail;
	private String messageTitle;
	private String messageContent;

	// Constructors

	/** default constructor */
	public Message() {
	}

	/** minimal constructor */
	public Message(Integer messageId) {
		this.messageId = messageId;
	}

	/** full constructor */
	public Message(Integer messageId, String messageName, String mesageMail,
			String messageTitle, String messageContent) {
		this.messageId = messageId;
		this.messageName = messageName;
		this.mesageMail = mesageMail;
		this.messageTitle = messageTitle;
		this.messageContent = messageContent;
	}

	// Property accessors

	public Integer getMessageId() {
		return this.messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public String getMessageName() {
		return this.messageName;
	}

	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}

	public String getMesageMail() {
		return this.mesageMail;
	}

	public void setMesageMail(String mesageMail) {
		this.mesageMail = mesageMail;
	}

	public String getMessageTitle() {
		return this.messageTitle;
	}

	public void setMessageTitle(String messageTitle) {
		this.messageTitle = messageTitle;
	}

	public String getMessageContent() {
		return this.messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

}