package main;

import java.util.Scanner;
import user.UserController;
import user.UserDto;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserController userController = new UserController();
		UserDto user = null;
		while(true) {
			System.out.println("(1)회원가입* (2)로그인 (3)비밀번호 수정* \r\n"
					+ "(4)회원탈퇴* (5)아이디 중복체크 (6)마이페이지 \r\n"
					+ "(7)회원목록 (8)아이디검색 (9)이름검색 \r\n"
					+ "(10)전체 회원수");
			switch (scanner.next()) {
			case "1":
				System.out.println("[회원가입] 아이디,비번,이름 ");
				user = new UserDto();
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				user.setName(scanner.next());
				userController.postJoin(user);
				break;
			case "2":
				System.out.println("[로그인] 아이디,비번 ");
				user = new UserDto();
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				UserDto loginUser = userController.postLogin(user);
				if(loginUser == null) {
					System.out.println("로그인 실패");
				}else {
					System.out.println(loginUser.toString());
				}
				
				break;
			case "3":
				System.out.println("[비밀번호 수정] 아이디, 변경할 비번 ");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				userController.putUpdate(user);
				break;
			case "4":
				System.out.println("[회원탈퇴] 아이디,비번 ");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				userController.deleteUser(user);
				break;
			case "5":
				System.out.println("아이디");
				boolean exist = userController.getIdCheck(scanner.next());
				break;
			case "6":
				System.out.println("아이디,비번 ");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				UserDto mypage = userController.getMypage(user);
				break;
			case "7":
				UserDto[] list = userController.getUserList();
				break;
			case "8":
				System.out.println("아이디");
				UserDto idSearch = userController.getIdSearch(scanner.next());
				break;
			case "9":
				System.out.println("이름");
				UserDto[] nameSearch = userController.getNameSearch(scanner.next());
				break;
			case "10":
				System.out.printf("전체회원수 : %d 명\n",userController.getCount());
				break;
			case "0":
				System.out.println("시스템종료");
				return;
			}
		}
	}

}
