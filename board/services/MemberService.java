package board.services;
import board.domains.StudentDto;
import board.domains.TeacherDto;
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
// 
