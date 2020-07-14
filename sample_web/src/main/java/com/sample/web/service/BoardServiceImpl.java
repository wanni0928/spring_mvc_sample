package com.sample.web.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.sample.web.dao.BoardDAO;
import com.sample.web.vo.BoardVO;
import com.sample.web.vo.Criteria;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;

	@Override
	public void write(BoardVO board) throws Exception {
		dao.write(board);
	}

	@Override
	public List<BoardVO> list(Criteria cri) throws Exception {
		return dao.list(cri);
	}

	@Override
	public BoardVO read(int bno) throws Exception {
		return dao.read(bno);
	}

	@Override
	public void update(BoardVO boardVO) throws Exception {
		dao.update(boardVO);
	}

	@Override
	public void delete(int bno) throws Exception {
		dao.delete(bno);
	}

	@Override
	public int listCount() throws Exception {
		return dao.listCount();
	}
}
