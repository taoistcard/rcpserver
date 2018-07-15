package com.i5i58.service.android.channel.async;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_DEFAULT)
public class MsgYxChatOpenClub extends MsgYxChatIdentity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4017616405116875274L;

	private String content = "";

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
