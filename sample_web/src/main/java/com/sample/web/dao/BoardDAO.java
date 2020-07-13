package com.sample.web.dao;

import java.util.List;

import com.sample.web.vo.BoardVO;

public interface BoardDAO {
	// 게시글 작성
	public void write(BoardVO board) throws Exception;
	// 게시글 목록
	public List<BoardVO> list() throws Exception;
	// 게시글 조회
	public BoardVO read(int bno) throws Exception;
	// 게시물 수정
	public void update(BoardVO boardVO) throws Exception;
	// 게시물 삭제
	public void delete(int bno) throws Exception;
}
