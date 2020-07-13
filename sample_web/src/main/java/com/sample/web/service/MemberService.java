package com.sample.web.service;

import java.util.List;

import com.sample.web.vo.MemberVO;

public interface MemberService {
	public List<MemberVO> selectMember() throws Exception;
}
