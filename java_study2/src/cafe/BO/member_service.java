package cafe.BO;

import cafe.DAO.member_DAO;

public class member_service {
	private member_DAO mdao = new member_DAO();
	
	public boolean sign_member(String id, String name, String tel, String email) {
		boolean check = mdao.id_check(id, email);
		boolean telCheck = mdao.tel_check(tel);
		boolean emailCheck = mdao.email_check(email);
		if(check) {
			System.out.println("이미 등록된 아이디 또는 이메일입니다.");
			return false;
		}
		else if(!telCheck) {
			System.out.println("전화번호 형식을 맞춰서 입력해주세요(ex. 01012345678)");
			return false;
		}
		else if(!emailCheck) {
			System.out.println("이메일 형식을 맞춰서 입력해주세요(ex. dy@naver.com)");
			return false;
		}
		else {
			mdao.member_insert(id, name, tel, email);
			System.out.println("회원가입 완료");
		}
		return true;
	}

	public boolean login(String id, String pw) {
		boolean chk = mdao.login(id, pw);
		
		if(chk) {
			
			return true;
		}
		
		return false;
	}
}
