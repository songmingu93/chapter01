package com.javaex.ex01;

public class Ex10 {
	
	public static void main(String[] args) {
		
		// 논리 연산자
		int a = 5;
		int b = 7;
		
		// 논리 연산자 기본 &&
		System.out.println("&&연산자 ================");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		//논리 연산자 기본 
		System.out.println("||연산자 ==============");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		// 논리 연산자 응용
		System.out.println("논리 연산자 응용====================");
		System.out.println((a>b)&&(a<b)); // (5>7)--f (5<7) --> t ->f
		System.out.println((a>b)&&(a>b)); // (5>7)--f (5>7) --> f ->f
		System.out.println((a>b)||(a<b)); // (5>7)--f (5<7) --> t ->t
		System.out.println((a>b)||(a<b)&&(a<b)); 
		System.out.println((a>b)&&(a<b)||(a<b));
		
		System.out.println((a>b)&&(a<b)&&(a<b));
		//if문 할 때 설명 --> 모두 ture 여야 ture다 -> 모두 만족해야한다.
		
		System.out.println("논리 연산자 !======================");
		System.out.println((a<b)); 
		System.out.println(!(a<b)); 
		System.out.println(!((a>b)&&(a>b)));
		
		
		System.out.println((a>b)&&!(a>b));
		System.out.println(!(a>b)&&!(a>b));

		
	}
	
}
