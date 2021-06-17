package com.javaex.ex01;

public class Ex09 {

	public static void main(String[] args) {
		
		// 관계 연산자 --> 결과는 true false --> 결과는 boolean 형이다.
		int n01 = 5;
		int n02 = 3;
		int n03 = 5;
		
		
		
		System.out.println(5<3);
		System.out.println(n01==n02); // 5<3 --> false
		System.out.println(n01>n02);  // 5>3 --> true
		System.out.println(n01<=n02); // 5<=3 --> false
		System.out.println(5<=5); // 5<=5 --> true // 둘 중 하나라도 맞으면 true
		System.out.println(n01>=n02); // 5>= 3 --> true
		
		System.out.println(n01==n02); // 5==3 --> false
		// System.out.println(n01=n02); // 잘못된 기호 --> 3 --> n01에 3을 대입
		
		System.out.println(n01 != n02); // 5=3? 다르니? --> true
		

	}
}