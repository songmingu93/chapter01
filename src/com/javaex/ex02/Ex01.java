package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int i = 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		
		String name = "황일영";
		
		
		System.out.println("안녕하세요");
		System.out.println(str);
		System.out.println("str");
		
		System.out.println(i);   
		System.out.println("i");
		System.out.println('i');
		System.out.println("ii");
		
		/*
		System.out.print("안녕");
		System.out.println("하");
		*/
		
		System.out.println("안녕");
		System.out.println("하");
		
		System.out.println("============");
		
		System.out.println(i);
		System.out.println(i+i);
		
		System.out.println(str);
		System.out.println(str+str); 
		
		System.out.println(str+i);  // "굿모닝" + 2345  --> "굿모닝" + "2345"
		System.out.println(str+d);  // "굿모닝" + 3.14  --> "굿모닝" + "3.14"
		System.out.println(str+ " 이랑 " + i + " 다");
		System.out.println(str+ " " +i + " 다");
		
		//주의
		System.out.println(c);
		System.out.println(c + c);  // 주의
		System.out.println(s + s);
		System.out.println(c + s);
		
		// 제이름은 황일영 입니다.
		System.out.println("제이름은 " + name + " 입니다.");
		
		System.out.println("안녕하세요");    // 안녕하세요
		System.out.println("안녕'하'세요");  // 안녕'하'세요
		System.out.println("안녕\"하\"세요");  // 안녕"하"세요
		
		System.out.println("안녕\\하\\세요");    // 안녕\하\세요
		
		System.out.println("안녕\t하\t세요");    // 안녕       하요
		System.out.println("안녕\n하세요");    // 안녕       하요
		
	}
	

}
