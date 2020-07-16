package com.sample.web.service;

import java.util.List;

import com.sample.web.vo.ReplyVO;

public interface ReplyService {
	public List<ReplyVO> readReply(int bno) throws Exception;
}
