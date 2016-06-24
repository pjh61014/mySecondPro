package emp.service;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import emp.dto.MyEmpDTO;

public interface MyEmpService {
	//ȸ���ο��� ��ȸ
		int count();
		//ȸ������
		void insert(MyEmpDTO user);
		//ȸ����������
		void update(MyEmpDTO userInfo);
		//ȸ��Ż��
		void delete(String id);
		//�α���
		MyEmpDTO login(MyEmpDTO emp);
		//ȸ����Ϻ���
		List<MyEmpDTO> getMemberList();
		//�ּҷ� �˻�
		List<MyEmpDTO> findByAddr(String addr);
		//ȸ�������˻�
		MyEmpDTO read(String id);
		//Ʈ����� �����ϱ�
		void txinsert(MyEmpDTO user);
}
