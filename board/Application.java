package board;
/*
<< RFP >>
"게시판 관리 프로그램"
String message = "1. 새글 작성 2. 글 목록 보기 3. 처음 화면으로";
" 1. 새글 쓰기 2. 목록 보기 3. 종료 \n > "
"제목: " "작성자: " "내용"
"사용해주셔서 감사합니다."
"아직 입력된 게시글이 없습니다."
"상세보기할 글을 선택해주세요 (0은 뒤로가기)\n>"
SimpleDateFormat sdf = new SimpleDateFormat("yy년 M월 d일 H시m분s초");
        System.out.println("제목: " + b.getTitle());
        System.out.println("글번호: " + b.getId());
        System.out.println("작성자: " + b.getWriter());
        System.out.println("작성일: " + sdf.format(b.getWrittenDate().getTime()));
        System.out.println("수정일: " + sdf.format(b.getUpdatedDate().getTime()));
        System.out.println("----------------------");
        System.out.println(b.getContent());

        String message = "1. 수정 2. 삭제 3. 뒤로가기 \n>";
        "정말로 삭제하시겠습니까? y/n"
        "댓글 내용: "
"비트 성적관리 프로그램"
"1. 입력 2. 목록 3. 종료\n>"
"사용해 주셔서 감사합니다."
번호, 이름, 국어, 영어, 수학
"상세보기할 학생의 번호를 입력해주세요(0은 뒤로가기)\n>
 System.out.printf("번호: %d번 이름: %s\n", s.getId(), s.getName());
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", 
                s.getKorean(), s.getEnglish(), s.getMath());
        System.out.printf("총점: %03d점 평균: %.2f점\n", 
User
    "1. 로그인 2. 회원가입 3. 종료"     
    "님 환영합니다."   
    "username (종료를 원하시면 x를 입력하세요): "
    "중복된 username입니다. 다시 입력해주세요"
*/
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = "비트 성적관리 프로그램";
        String navi = "[회원관리]1. 새글 작성 2. 글 목록 보기 3. 처음 화면으로"+
        " 1. 새글 쓰기 2. 목록 보기 3. 종료 \n > ";
        while(true){
            System.out.println("");
            switch (scanner.next()) {
                case "1":
                    
                    break;
            
                case "0":
                    System.out.println("종료");
                    return;
            }
        }

    }
}
