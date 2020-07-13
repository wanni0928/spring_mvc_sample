package com.sample.web.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sample.web.dao.MemberDAO;
import com.sample.web.vo.MemberVO;

@Service
public class MemberServiceImple implements MemberService {
	
	@Inject
	private MemberDAO dao;
	
	@Override
	public List<MemberVO> selectMember() throws Exception {
		return dao.selectMember();
	}
	
}
