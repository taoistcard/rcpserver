package com.i5i58.service.android.channel.async;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_DEFAULT)
public class MsgYxChatEnter extends MsgYxChatIdentity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2808399951452907558L;
	/**
	 * 守护坐骑id
	 */
	private int gMtsId = 0;
	/**
	 * 普通和vip坐骑id
	 */
	private int mtsId  = 0;
	
	/**
	 * 在观众中的序号
	 */
	private long indexByViewer = 0L;
	
	/**
	 * 在贵宾中的序号
	 */
	private long indexByRicher = 0L;
	
	public int getgMtsId() {
		return gMtsId;
	}
	public void setgMtsId(int gMtsId) {
		this.gMtsId = gMtsId;
	}
	public int getMtsId() {
		return mtsId;
	}
	public void setMtsId(int mtsId) {
		this.mtsId = mtsId;
	}
	public long getIndexByViewer() {
		return indexByViewer;
	}
	public void setIndexByViewer(long indexByViewer) {
		this.indexByViewer = indexByViewer;
	}
	public long getIndexByRicher() {
		return indexByRicher;
	}
	public void setIndexByRicher(long indexByRicher) {
		this.indexByRicher = indexByRicher;
	}
}

