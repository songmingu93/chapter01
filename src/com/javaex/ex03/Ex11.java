package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		
		
		
		int num = sc.nextInt();
		
		switch (num) {
	        case 1:
	        	System.out.println("31일 입니다.");
	            break;
	 
	        case 2:
	        	System.out.println("28일 입니다.");
	            break;
	 
	        case 3:
	        	System.out.println("31일 입니다.");
	            break;
	 
	        case 4:
	        	System.out.println("30일 입니다.");
	            break;
	            
	        case 5:
	        	System.out.println("31일 입니다.");
	            break;
	 
	        case 6:
	        	System.out.println("30일 입니다.");
	            break;
	 
	        case 7:
	        	System.out.println("31일 입니다.");
	            break;
	 
	        case 8:
	        	System.out.println("31일 입니다.");
	            break;
	            
	        case 9:
	        	System.out.println("30일 입니다.");
	            break;
	            
	        case 10:
	        	System.out.println("31일 입니다.");
	            break;
	            
	        case 11:
	        	System.out.println("30일 입니다.");
	            break;
	          
	        default:
	        	System.out.println("31일 입니다.");
	            break;
		}// 브레이크가 없으면 아래쪽 까지 실행된다 
		sc.close();
	}
	
}
