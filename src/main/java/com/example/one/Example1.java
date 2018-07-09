package com.example.one;

public class Example1 {
	
	public Example1()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a test");

		
	}
	public void add(int first, int second)
	{
		int total = first + second;
		//System.out.println("Adding numbers " + total);
		
	}
	
	public void sub(int first, int second)
	{
		int total = first - second;
		//System.out.println("Adding numbers " + total);
		
	}
	
	public void mult(int first, int second)
	{
		int total = first * second;
		//System.out.println("Adding numbers " + total);
		System.out.println("Adding something different here");
		
	}
	public void divide(int first, int second)
	{
		int total = first / second;
		System.out.println("Mult numbers " + total);
		System.out.println("New line added for method Mult");
	}
	

}
