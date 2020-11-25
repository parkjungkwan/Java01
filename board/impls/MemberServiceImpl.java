package board.impls;

import board.domains.MemberDto;
import board.domains.StudentDto;
import board.domains.TeacherDto;
import board.services.MemberService;

public class MemberServiceImpl implements MemberService {

    @Override
    public void registerMember(MemberDto member) {
        // TODO Auto-generated method stub

    }

    @Override
    public void modifyMember(MemberDto member) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeMember(MemberDto member) {
        // TODO Auto-generated method stub

    }

    @Override
    public StudentDto login(StudentDto student) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TeacherDto access(TeacherDto teacher) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StudentDto[] fetchStudentList() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StudentDto fetchStudentDetail(String userId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int sum(StudentDto student) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float avg(int sum) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean existId(String userid) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
