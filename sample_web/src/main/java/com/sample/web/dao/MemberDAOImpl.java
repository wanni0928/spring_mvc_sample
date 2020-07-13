package com.sample.web.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.sample.web.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Inject
	private SqlSession sqlSession;
	private static final String Namespace = "memberMapper";
	
	@Override
	public List<MemberVO> selectMember() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(Namespace+".selectMember");
	}
	
}
