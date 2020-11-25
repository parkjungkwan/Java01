package board.services;
import board.domains.StudentDto;
import board.domains.TeacherDto;
// 학생등록, 강사등록, 학생정보수정, 학생정보삭제, 학생로그인,
// 강사등록, 강사접속, 학생목록보기, 학생상세정보, 성적합계, 성적평균, 아이디중복체크
public interface MemberService {
    public void registerStudent(StudentDto student);
    public void registerTeacher(TeacherDto teacher);
    public void modifyStudent(StudentDto student);
    public void removeStudent(StudentDto student);
    public StudentDto login(StudentDto student);
    public TeacherDto access(TeacherDto teacher);
    public StudentDto[] fetchStudentList();
    public StudentDto fetchStudentDetail(String userId); 
    public int sum(StudentDto student);
    public float avg(int sum);
    public boolean existId(String userid);

}

