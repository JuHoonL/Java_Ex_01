package com.biz.ex02;

public class GradeProcess03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 1. 5명의 학생 성적 계산
		 */
		
		for(int intNum = 0 ; intNum < 5 ; intNum ++) {
			processGrade(intNum + 1) ;
		}

	}

	public static void processGrade(int intNum) {
		// TODO Auto-generated method stub
		System.out.println("======================================================================");
		System.out.println(intNum + "번 학생");
		System.out.println("----------------------------------------------------------------------");
		
		int intKor = makeScore() ;
		int intEng = makeScore() ;
		int intMth = makeScore() ;
		int intSci = makeScore() ;
		int intHis = makeScore() ;
		
		System.out.printf("국어점수 : %d ", intKor);
		System.out.printf("영어점수 : %d ", intEng);
		System.out.printf("수학점수 : %d ", intMth);
		System.out.printf("과학점수 : %d ", intSci);
		System.out.printf("국사점수 : %d\n", intHis);
		System.out.println("----------------------------------------------------------------------");
		
		makeSum(intKor, intEng, intMth, intSci, intHis) ;
	}
	
	public static int makeScore() {
		return (int)(Math.random() * (100-50+1))+50 ;
	}
	
	public static void makeSum(int intKor, int intEng, int intMth, int intSci, int intHis) {
		int intSum = intKor + intEng + intMth + intSci + intHis ;
		System.out.println("총점 : " + intSum);
		
		makeAvg(intSum);
	}
	
	public static void makeAvg(int intSum) {
		float floatAvg = (float)intSum / 5 ;
		System.out.println("평균 : " + floatAvg);
	}
	

}
