package com.sample.web.service;

import java.util.List;

import com.sample.web.vo.MemberVO;

public interface MemberService {
	public void register(MemberVO vo) throws Exception;
	public MemberVO login(MemberVO vo) throws Exception;
	public void memberUpdate(MemberVO vo) throws Exception;
	public void memberDelete(MemberVO vo) throws Exception;
}
