package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		// 4 6 9 11 --> 30일
		// 2  ---> 28일
		// 나머지 --> 31일
		
		switch (num) {
		
        	case 4:
	        case 6:
	        case 9:
	        case 11:
	        	System.out.println("30일");
	            break;
	            
	        case 2:
	        	System.out.println("28일");
	            break;
		
	        default:
	        	System.out.println("31일");
	        	break;
	        	
		}// 브레이크가 없으면 아래쪽 까지 실행된다 
		sc.close();
	}
	
}