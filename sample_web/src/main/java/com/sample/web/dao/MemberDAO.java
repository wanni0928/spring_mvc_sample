package com.sample.web.dao;

import java.util.List;

import com.sample.web.vo.MemberVO;

public interface MemberDAO {
	public List<MemberVO> selectMember() throws Exception;
}
