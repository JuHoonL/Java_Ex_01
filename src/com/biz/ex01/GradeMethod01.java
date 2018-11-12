package com.biz.ex01;

public class GradeMethod01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 1. 국어, 영어, 수학, 과학 성적을 저장할 int형 변수 선언
		 2. 각 과목의 점수를 0~100까지 범위의 임의의 점수를 변수에 저장
		 3. gradeSum() Method 생성하여, 매개변수 4개를 전달받아 성적 평균을 소수점까지 계산
		 4. main으로 결과를 return 하여 콘솔에 표시
		 */
		
		int intKor = 90;
		int intEng = 88;
		int intMth = 77;
		int intSce = 67;
		
		System.out.println(gradeSum(intKor, intEng, intMth, intSce));

	}
	public static float gradeSum(int intKor, int intEng, int intMth, int intSce) {
		float intSum = intKor + intEng + intMth + intSce ;
		float floatVal = intSum / 4 ;
		
		return floatVal ;
		
	}
}
