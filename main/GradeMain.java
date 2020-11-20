package main;
import java.util.Scanner;

import grade.GradeDto;

public class GradeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeDto grade = new GradeDto();
		System.out.println("이름: ");
		grade.setName(scanner.next());
		System.out.println("국어점수: ");
		grade.setKor(scanner.nextInt());
		System.out.println("영어점수: ");
		grade.setEng(scanner.nextInt());
		System.out.println("수학점수: ");
		grade.setMath(scanner.nextInt());
	}

}
