package emp.service;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import emp.dto.MyEmpDTO;

public interface MyEmpService {
	//회원인원수 조회
		int count();
		//회원가입
		void insert(MyEmpDTO user);
		//회원정보수정
		void update(MyEmpDTO userInfo);
		//회원탈퇴
		void delete(String id);
		//로그인
		MyEmpDTO login(MyEmpDTO emp);
		//회원목록보기
		List<MyEmpDTO> getMemberList();
		//주소로 검색
		List<MyEmpDTO> findByAddr(String addr);
		//회원정보검색
		MyEmpDTO read(String id);
		//트랜잭션 연습하기
		void txinsert(MyEmpDTO user);
}
