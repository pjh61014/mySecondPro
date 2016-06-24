package board.dao;

import java.util.List;

import board.dto.BoardDTO;

public interface BoardDAO {
	void register(BoardDTO board);
	void update();
	void delete();
	List<BoardDTO> getBoardlist();
	BoardDTO read();
}
