package com.sample.web.dao;

import java.util.List;

import com.sample.web.vo.ReplyVO;

public interface ReplyDAO {
	//댓글 조회
	public List<ReplyVO> readReply (int bno) throws Exception;
}
