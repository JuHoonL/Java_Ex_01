package com.biz.ex02;

public class GradeProcess01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intKor = makeNum() ;
		int intEng = makeNum() ;
		int intMth = makeNum() ;
		int intSci = makeNum() ;
		int intHis = makeNum() ;
		
		// 메소드를 사용하지않는 계산식
		int intSum = intKor + intEng + intMth + intSci + intHis ;
		float floatavg = (float)intSum / 5 ;
		//float floatavg = intSum / 5f ; intSum이나 5 둘중하나를 float형으로 바꿔주어야함
		
		System.out.printf("총점은 %d점 이고, 평균은 %f 점 이다.\n", intSum, floatavg);	
		// printf 에서는 10진수정수는 d, float형은 f, double형은 e나 g, 문자열은 s, 문자는 c 로 써줘야한다.
		// 8진수정수는 o, 16진수정수는 x로 표기     예> %d, %f, %e, %c
		System.out.println("총점은 : " + intSum);
		System.out.println("평균은 : " + floatavg);
		
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d, 과학 : %d, 국사 : %d, 총점 : %d\n", intKor, intEng, intMth, intSci, intHis, intSum);
		System.out.println("평균은 " + floatavg);
		
		// 변수 2개를 받는 메소드를 사용한 계산식
		int sum = intSum(intKor, intEng) ;
		sum += intSum(intMth, intSci) ;
		sum += intHis ;
		
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d, 과학 : %d, 국사 : %d, 총점 : %d\n", intKor, intEng, intMth, intSci, intHis, sum);
		System.out.println("평균은 " + (float)sum/5);
		
		// 변수 5개를 모두 받아 메소드를 사용한 계산식
		int aSum = intAllSum(intKor, intEng, intMth, intSci, intHis) ;
		
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d, 과학 : %d, 국사 : %d, 총점 : %d\n", intKor, intEng, intMth, intSci, intHis, aSum);
		System.out.println("평균은 " + (float)aSum/5);

	}
	
	public static int makeNum() {
		return (int)(Math.random() * (100+1)) ;
	}
	
	public static int intSum(int intNum1, int intNum2) {
		return intNum1 + intNum2 ;
	}
	
	public static int intAllSum(int intN1, int intN2, int intN3, int intN4, int intN5) {
		return intN1 + intN2 + intN3 + intN4 +intN5 ;
	}
	
}
