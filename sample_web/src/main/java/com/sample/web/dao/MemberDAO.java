package com.sample.web.dao;

import java.util.List;

import com.sample.web.vo.MemberVO;

public interface MemberDAO {
	// 회원가입
	public void register(MemberVO vo) throws Exception;
	//로그인
	public MemberVO login(MemberVO vo) throws Exception;
	// 회원정보 수정
	public void memberUpdate(MemberVO vo)throws Exception;
	// 회원 탈퇴
	public void memberDelete(MemberVO vo) throws Exception;
}
