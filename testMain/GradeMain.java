package testMain;

import java.util.Scanner;

import test.GradeController;
import test.GradeDto;

public class GradeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeController gradeController = new GradeController();
		GradeDto grade = null;
		
		while(true) {
			System.out.println("Menu: 0.종료 1.성적입력 2.수정 3.삭제 4.등수");
			switch(scanner.next()) {
			case "0": System.out.print("시스템 종료");
				return;
			
			case "1": 
				grade = new GradeDto();
				System.out.println("이름, 국어, 영어, 수학");
				grade.setName(scanner.next());
				grade.setKor(scanner.nextInt());
				grade.setEng(scanner.nextInt());
				grade.setMath(scanner.nextInt());
				gradeController.postGrade(grade);
							
				break;
			
			case "2":
				grade = new GradeDto();
				System.out.println("이름, 국어, 영어, 수학");
				grade.setName(scanner.next());
				grade.setKor(scanner.nextInt());
				grade.setEng(scanner.nextInt());
				grade.setMath(scanner.nextInt());
				gradeController.putGrade(grade);	
				break;
			
			case "3":
				grade = new GradeDto();
				System.out.println("이름: ");
				grade.setName(scanner.next());
				gradeController.deleteGrade(grade);							
				break;
			case "4":
				GradeDto[] grades = gradeController.getGradeSort();
				for(int i=0;i<gradeController.getCount();i++) {
					System.out.printf("%d등 %s (총점: %d점, 평균: %.2f점)\n", i+1,
							grades[i].getName(), grades[i].getSum(),
							grades[i].getAvg());
				}
				break;
				
			}
		}
	}

}
