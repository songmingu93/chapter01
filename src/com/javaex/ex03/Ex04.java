package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간:");
		
		int time = sc.nextInt();
		
		//int sum01 = 8*10000 + (time-8)*12000;
		//int sum02 = time*10000;
		
		// <=8도 가능? 
		if(time >= 9) {
			int sum = 8*10000 + (time-8)*12000;
			System.out.println(sum);
		}else {
			int sum = time*10000;
			System.out.println(sum);
		}
		
		
		sc.close();

	}

}