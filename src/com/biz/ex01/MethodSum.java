package com.biz.ex01;

public class MethodSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 1. retSum()메서드를 선언하시오
		 2. int 형 매개변수 1개를 선언하시오
		 3. main에서 숫자 50을 전달하시오
		 4. retSum에서 전달받은 값에 + 100을 실해
		 5. 결과를 다시 main으로 return 하시오
		 6. main에서 console에 결과를 출력하시오
		 */
		int intNum = 50;
		System.out.println("해당 값 : " + retSum(intNum));
		
		int intretSum = retSum(intNum);
		System.out.println("해당 값 : " + intretSum);
		

	}
	public static int retSum(int intNum) {
		intNum += 100;
		return intNum;
	}

}
