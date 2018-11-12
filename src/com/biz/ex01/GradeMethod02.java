package com.biz.ex01;

public class GradeMethod02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 1. 국어, 영어, 수학, 과학 성적을 저장할 int형 변수 선언
		 2. 각 과목의 점수를 0~100까지 범위의 임의의 점수를 변수에 저장
		 3. gradeSum() Method 생성하여, 매개변수 4개를 전달받아 성적 총점을 계산하고
		 4. main으로 결과를 return 한 다음 main에서 평균을 계산한 후 콘솔에 표시
		 */

		int intKor = 88 ;
		int intEng = 93 ;
		int intMth = 76 ;
		int intSce = 82 ;
		
		float avg = gradeSum(intKor, intEng, intMth, intSce) / 4 ;
		System.out.println("4과목의 평균은 : " + avg);
		
	}
	public static float gradeSum(int intKor, int intEng, int intMth, int intSce) {
		float intSum = intKor + intEng + intMth + intSce ;
		return intSum ;
	}
}
