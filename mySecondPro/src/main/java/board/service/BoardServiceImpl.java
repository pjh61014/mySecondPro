package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import board.dao.BoardDAO;
import board.dto.BoardDTO;
@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	@Qualifier("dao")
	BoardDAO dao;
	
	public BoardServiceImpl() {
		super();
	}	
	
	public BoardServiceImpl(BoardDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public void register(BoardDTO board) {
		dao.register(board);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
	}

	@Override
	public List<BoardDTO> getBoardlist() {
		dao.getBoardlist();
		return null;
	}

	@Override
	public BoardDTO read(String board_no) {
		dao.read();
		return null;
	}

}
