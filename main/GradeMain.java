package main;
import java.util.Scanner;

import grade.GradeDto;
import grade.GradeController;
public class GradeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeController gradeController = new GradeController();
		
		
		// 1등: a, 합계: 270 ,평균: 90.0
		// 2등: b, 합계: 240 ,평균: 80.0
		// 3등: c, 합계: 210 ,평균: 70.0
		GradeDto grade = null;
		while(true) {
			System.out.println("[메뉴] 0.종료 1.성적등록 2.등수발표(이름,합계,평균)");
			switch (scanner.next()) {
			case "1":
				grade = new GradeDto();
				System.out.println("이름, 국어점수, 영어점수, 수학점수");
				grade.setName(scanner.next());
				grade.setKor(scanner.nextInt());
				grade.setEng(scanner.nextInt());
				grade.setMath(scanner.nextInt());
				gradeController.postGrade(grade);
				break;
			case "2":
				GradeDto[] grades = gradeController.getGradeSort();
				for(int i=0;i<gradeController.getCount(); i++) {
					System.out.println(grades[i].toString());
				}
				break;

			case "0":
				System.out.println("시스템 종료");
				return;
			}
		}
	}

}



