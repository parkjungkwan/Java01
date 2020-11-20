package user;
/*
(1)회원가입* (2)로그인 (3)비밀번호 수정* 
(4)회원탈퇴* (5)아이디 중복체크 (6)마이페이지 
(7)회원목록 (8)아이디검색 (9)이름검색 
(10)전체 회원수");
 * */
public interface UserService {
	public void join(UserDto user);
	public UserDto login(UserDto user);
	public void update(UserDto user);
	public void delete(UserDto user);
	public boolean idCheck(String id);
	public UserDto mypage(UserDto user);
	public int countSameName(String name);
	public UserDto[] userList();
	public UserDto idSearch(String id);
	public UserDto[] nameSearch(String name);
	public int count();
}
