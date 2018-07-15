package com.i5i58.service.android.channel.async;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.i5i58.data.im.YxCustomMsg;
import com.i5i58.util.JsonUtils;
import com.i5i58.util.StringUtils;
import com.i5i58.yunxin.YunxinIM;
import com.i5i58.yunxin.Utils.CodeToString;
import com.i5i58.yunxin.Utils.YXResultSet;

public class TaskYxChatOpenClub implements Runnable {

	private Logger logger = Logger.getLogger(getClass());

	private String roomId;
	private String accId;

	private MsgYxChatOpenClub msg;

	public TaskYxChatOpenClub(String roomId, String accId, String name, int vip, long vipDeadLine, int guard,
			long guardDeadLine, long richScore, int fansClub, String clubName) {
		super();
		this.roomId = roomId;
		this.accId = accId;
		this.msg = new MsgYxChatOpenClub();
		this.msg.setAccId(accId);
		this.msg.setName(name);
		this.msg.setVip(vip);
		this.msg.setVipDeadLine(vipDeadLine);
		this.msg.setGuard(guard);
		this.msg.setGuardDeadLine(guardDeadLine);
		this.msg.setRichScore(richScore);
		this.msg.setFansClub(fansClub);
		this.msg.setClubName(clubName);
		this.msg.setContent("加入粉丝团");
	}

	@Override
	public void run() {
		String uuid = StringUtils.createUUID();
		YXResultSet resultR;
		try {
			YxCustomMsg yxChatMsg = new YxCustomMsg();
			yxChatMsg.setCmd("openClub");
			yxChatMsg.setData(this.msg);
			resultR = YunxinIM.sendChatRoomMsg(roomId, uuid, accId, "100", "0", "", new JsonUtils().toJson(yxChatMsg));
			if (!"200".equals(resultR.getCode())) {
				logger.error(String.format("MsgYxChatOpenClub:{code:%s, roomId:%s, accId:%s, name:%s}",
						CodeToString.getString(resultR.getCode()), roomId, accId, this.msg.getName()));
			}
		} catch (IOException e) {
			logger.error("", e);
		}
	}

}
