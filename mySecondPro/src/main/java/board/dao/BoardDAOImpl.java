package board.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import emp.dto.MyEmpRowMapper;
import board.dto.BoardDTO;
import board.dto.BoardRowMapper;
@Repository("dao")
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	private JdbcTemplate template;
	
	public BoardDAOImpl() {
		super();
	}
	
	public BoardDAOImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public void register(BoardDTO board) {
		String sql = "insert into tb_board values(seq.NEXTVAL, ?, ?, ?, 0, 0, "+
					 "to_char(sysdate,'YY/MM/DD HH24:MI:SS'), "+
					 "to_char(sysdate,'YY/MM/DD HH24:MI:SS'))";
		
		int result = template.update(sql, 
						board.getBoard_no(), board.getMem_id(), board.getTitle(), 
						board.getText(), board.getCount(), board.getDel_flg(), 
						board.getReg_dtm(), board.getMod_dtm());
		System.out.println(result+"°³ »ðÀÔ¼º°ø");
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
		String sql = "select * from tb_board";
		return template.query(sql, new BoardRowMapper());
	}

	@Override
	public BoardDTO read() {
		// TODO Auto-generated method stub
		return null;
	}

}
