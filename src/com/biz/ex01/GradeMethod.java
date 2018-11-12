package com.biz.ex01;

public class GradeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 1. 국어, 영어, 수학 성적을 저장할 int 형 변수 3개  선언
		 2. 각 과목의 점수를 0~100까지 범위의 임의의 점수로 생성
		 3. gradeSum() Method 생성하여, 매개변수 3개를 전달받아 성적합계 계산
		 4. Main으로 결과를 return 하여 콘솔에 표시
		 */
		
		int korGrade = 86;
		int engGrade = 89;
		int mathGrade = 93;
		
		gradeSum(korGrade, engGrade, mathGrade);
		
		int Sum = gradeSum(korGrade, engGrade, mathGrade);
		
		
		System.out.println("성적 총점 = " + Sum);
		
		
	

	}
	public static int gradeSum(int intkorGrade, int intengGrade, int intmathGrade) {

		int intSum = intkorGrade + intengGrade + intmathGrade ;
	
		return intSum ; 
	}
		

}
