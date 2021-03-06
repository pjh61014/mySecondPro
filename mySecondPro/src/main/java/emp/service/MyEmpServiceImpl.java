package emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import emp.dao.MyEmpDAO;
import emp.dto.MyEmpDTO;
@Service
public class MyEmpServiceImpl implements MyEmpService {
	@Autowired
	@Qualifier("empmybatis")
	MyEmpDAO dao;
	
	
	
	public MyEmpServiceImpl() {
		super();
	}

	public MyEmpServiceImpl(MyEmpDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return dao.count();
	}

	@Override
	public void insert(MyEmpDTO user) {
		dao.insert(user);

	}

	@Override
	public void update(MyEmpDTO userInfo) {
		dao.update(userInfo);
	}

	@Override
	public void delete(String id) {
		dao.delete(id);

	}

	@Override
	public MyEmpDTO login(MyEmpDTO emp) {
		
		return dao.login(emp);
	}

	@Override
	public List<MyEmpDTO> getMemberList() {
		return dao.getMemberList();
	}

	@Override
	public List<MyEmpDTO> findByAddr(String addr) {
		// TODO Auto-generated method stub
		return dao.findByAddr(addr);
	}

	@Override
	public MyEmpDTO read(String id) {
		return dao.read(id);
	}
	
	// 트랜잭션 처리를 테스트하기 위한 service의 insert
	@Override
	public void txinsert(MyEmpDTO user) {
		dao.insert(user);
		dao.insert(null);
	}

}
