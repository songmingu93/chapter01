package com.javaex.ex01;

public class Ex04 {
	public static void main(String[] args) {
	
	/*
	//기본사용방법
	char ch01 = 'A';
	char ch02 = '안';
	
	System.out.println(ch01);
	System.out.println(ch02);
	*/
		
		
	// 숫자로 대입이 된다. int와 헷갈릴 수 있다.	
	char ch03 = 65;
	System.out.println(ch03);
	
	char ch04 = 65;  //의도는 정수 65를 대입하러 했으나 자료형은 char 선언한 경우
	System.out.println(ch04);
	
	//소수점을 나타내면 실수 'double, float'
	//문자는 - 1글자 문자열은  ---> 1글자 이상
	//숫자로 주민번호 예시 ---> 표현을 못할 경우 string 으로 표시해준다.
	char ch05 = '송';
	String ch06 = "송민규"; 
	
	System.out.println(ch05);
	System.out.println(ch06);
	
	
	}
	}
