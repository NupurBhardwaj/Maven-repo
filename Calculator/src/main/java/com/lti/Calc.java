package com.lti;

public class Calc {
    public static int add(int num1,int num2) {
    	return num1+num2;
    }
    
    public static int subs(int num1,int num2) {
    	return num1-num2;
    }
    
    public static int prod(int num1,int num2) {
    	return num1*num2;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Sum=" +add(10,20));
      System.out.println("Difference=" +subs(60,20));
      System.out.println("Product=" +prod(30,20));
	}

}
