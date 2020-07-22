package com.sample.web.dao;

import java.util.List;
import java.util.Map;

import com.sample.web.vo.BoardVO;
import com.sample.web.vo.SearchCriteria;

public interface BoardDAO {
	// 게시글 작성
	public void write(BoardVO board) throws Exception;
	// 게시글 목록
	public List<BoardVO> list(SearchCriteria scri) throws Exception;
	// 게시글 총 갯수
	public int listCount(SearchCriteria scri) throws Exception;
	// 게시글 조회
	public BoardVO read(int bno) throws Exception;
	// 게시물 수정
	public void update(BoardVO boardVO) throws Exception;
	// 게시물 삭제
	public void delete(int bno) throws Exception;
	// 첨부파일 업로드
	public void insertFile(Map<String, Object> map) throws Exception;
}
