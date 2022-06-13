package com.JANA60.jsnacksblocco1.controller.main;

public class jSnack4 {

	public static void main(String[] args) 
	{
		int[] numbers= {5,29,45,30,10,2,8,7};
		int res=0;
		
		for(int i=1; i<numbers.length;i+=2)
		{
			
			res+=numbers[i];
		}
		
		
		System.out.println("The sum of the number in the odd position of the array is: "+res);
		
	}

}
