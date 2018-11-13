package com.biz.ex02;

public class GradeProcess02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 1. 5명의 학생 성적을 처리하려고 한다.
		  *for를 이용 5번 실행
		 2. 각 학생의 국어, 영어, 수학, 과학, 국사 과목의 성적을 임의로 설정하고
		 3. 총점과 평균을 계산하시오
		 4. 총점은 gradeSum() method를 선언하여 계산을 수행 
		 */
		
		for(int g = 0 ; g < 5 ; g ++) {
			int intKor = makeGrade() ;
			int intEng = makeGrade() ;
			int intMth = makeGrade() ;
			int intSci = makeGrade() ;
			int inthis = makeGrade() ;
			
			int intSum = aSum(intKor, intEng, intMth, intSci, inthis) ;
			float floatAvg = (float)intSum / 5 ;
			
			System.out.printf("국어 : %d, 영어 : %d, 수학 : %d, 과학 : %d, 국사 : %d\n 총점 : %d, 평균 : %f\n", 
					intKor, intEng, intMth, intSci, inthis, intSum, floatAvg);
			
		}
		System.out.println("=========================================");
		
		for(int g = 0 ; g < 5 ; g ++) {
			int intKor = makeGrade() ;
			int intEng = makeGrade() ;
			int intMth = makeGrade() ;
			int intSci = makeGrade() ;
			int inthis = makeGrade() ;
			
			int intSum = aSum(intKor, intEng) + aSum(intMth, intSci, inthis) ;
			float floatAvg = (float)intSum / 5 ;
			
			System.out.printf("국어 : %d, 영어 : %d, 수학 : %d, 과학 : %d, 국사 : %d\n 총점 : %d, 평균 : %f\n", 
					intKor, intEng, intMth, intSci, inthis, intSum, floatAvg);
			
		}

	}

	public static int makeGrade() {
		return (int)(Math.random() * 101) ;
	}
	
	public static int aSum(int kor, int eng, int mth, int sci, int his) {
		return kor + eng + mth + sci + his ;
	}
	
	public static int aSum(int kor, int eng) {
		return kor + eng ;
	}
	
	public static int aSum(int mth, int sci, int his) {
		return mth + sci + mth ;
	}
}
