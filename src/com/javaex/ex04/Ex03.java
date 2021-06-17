package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dan;
        
        System.out.print("단:");
        int dan1 = sc.nextInt();
        
        for(int i=1; i<=9; i++
        		) {
        	int result = dan1*1;
        	System.out.println(dan1 + "*" + i + "=" + result);
        	
        }
        
        sc.close();
 	}

}