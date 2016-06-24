package board.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
//JdbcTemplate���� ������ jdbc���ø� Ŭ�������� select�� ������ �� ó���� �� �ֵ���
//�ϳ��� row�� ���� ó�� ������ ��� �ִ� ��ü�� query�޼ҵ� ���ο��� ȣ���� ��ü
public class BoardRowMapper implements RowMapper<BoardDTO> {

	@Override
	public BoardDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		//List�� �� ��ҷ� add��ų ���ڸ��� dto�� ��ȯ�ϴ� �۾� ����
		//System.out.println("mapRow()==>"+rowNum);
		BoardDTO board =
				new BoardDTO(rs.getString(1),rs.getString(2),
						rs.getString(3),rs.getString(4),rs.getInt(5),
						rs.getString(6),rs.getString(7),rs.getString(8));
		//System.out.println(board);
		return board;
	}
	
}
