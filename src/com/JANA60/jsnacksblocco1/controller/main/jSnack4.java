package com.JANA60.jsnacksblocco1.controller.main;

import java.util.Random;

public class jSnack4 {

	public static void main(String[] args) 
	{
		Random r = new Random();
		int res=0, max=100;
		int[] numbers= new int[r.nextInt(max)];
		
		
		
		
		for (int j=0;j<numbers.length;j++)
		{
			numbers[j]=r.nextInt(max);
			System.out.println("Position "+(j+1)+ ": " +numbers[j]);
		}
		
		
		
		for(int i=1; i<numbers.length;i+=2)
		{
			
			res+=numbers[i];
		}
		
		
		System.out.println("The sum of the number in the odd position of the array is: "+res);
		
	}

}
