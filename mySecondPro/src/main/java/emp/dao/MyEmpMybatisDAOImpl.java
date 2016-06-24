package emp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import emp.dto.MyEmpDTO;
@Repository("empmybatis")
public class MyEmpMybatisDAOImpl implements MyEmpDAO {
	//Spring���� Mybatis�� ����ϱ� ���� ��� ����� �������ִ� �ٽ� Ŭ����
	//JdbcTemplate�� ���� ����
	@Autowired
	SqlSession sqlSession;
	@Override
	public int count() {
		int result = sqlSession.selectOne("kitri.myemp.count");
		return result;
	}

	@Override
	public void insert(MyEmpDTO user) {
		int result = sqlSession.insert("kitri.myemp.insert",user);
		System.out.println(result+"�� ���Լ���");
	}

	@Override
	public void update(MyEmpDTO userInfo) {
		int result = sqlSession.update("kitri.myemp.update", userInfo);
		System.out.println(result+"�� ��������");
	}

	@Override
	public void delete(String id) {
		int result = sqlSession.delete("kitri.myemp.delete", id);
		System.out.println(result+"�� ��������");

	}

	@Override
	public MyEmpDTO login(MyEmpDTO emp) {
		
		return sqlSession.selectOne("kitri.myemp.login", emp);
	}

	@Override
	public List<MyEmpDTO> getMemberList() {
		System.out.println("mybatis�� selectall ����");
		return sqlSession.selectList("kitri.myemp.list");
	}

	@Override
	public List<MyEmpDTO> findByAddr(String addr) {
		System.out.println("mybatis�� search ����");
		return sqlSession.selectList("kitri.myemp.search","%"+addr+"%");
	}

	@Override
	public MyEmpDTO read(String id) {
		
		return sqlSession.selectOne("kitri.myemp.read", id);
	}

	@Override
	public MyEmpDTO login(String id, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

}
