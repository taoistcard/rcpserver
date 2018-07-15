package com.i5i58.service.channel.async;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_DEFAULT)
public class MsgYxChatSetMute implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4013198003809530366L;

	private String content = "";

	private String accId = "";

	private String muted = "";

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public String getMuted() {
		return muted;
	}

	public void setMuted(String muted) {
		this.muted = muted;
	}

}