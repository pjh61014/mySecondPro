package board.service;

import java.util.List;

import board.dto.BoardDTO;

public interface BoardService {
	void register(BoardDTO board);
	void update();
	void delete();
	List<BoardDTO> getBoardlist();
	BoardDTO read(String board_no);
}
