package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를입력하세요:");
		
		int num = sc.nextInt();
		
		if(num >= 90) {
			System.out.println("A등급");
		}else if(num >= 80) {
			System.out.println("B등급");
		}else if(num >= 70){
			System.out.println("C등급");
		}else if(num >= 60){
			System.out.println("D등급");
		}else if(num < 60 ){
			System.out.println("F등급");
		}
		
		// 또 질문있을 때 else 
		
		sc.close();

	}

}