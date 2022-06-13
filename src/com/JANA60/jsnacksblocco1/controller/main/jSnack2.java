package com.JANA60.jsnacksblocco1.controller.main;

import java.util.Scanner;

public class jSnack2 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int num;
		String answer="";
		
		do
		{
			System.out.println("Please insert a number:");
			num=Integer.parseInt(keyboard.nextLine());
			if(num %2 ==0)
				System.out.println("The number you chose is even, so I can print it: "+ num);
			else
				System.out.println("The number you chose is odd, so I print the next even one: "+ (num+1));
			
			do
			{
				System.out.println("Would you like to try again? ");
				answer= keyboard.nextLine();
				if(!answer.equalsIgnoreCase("yes")&&!answer.equalsIgnoreCase("no"))
					System.out.println("Wrong answer, please write yes or no.");
			}while(!answer.equalsIgnoreCase("yes")&&!answer.equalsIgnoreCase("no"));
			
		}while (answer.equalsIgnoreCase("yes"));
		
		System.out.println("Thank you, bye!");
		
		keyboard.close();
	}

}
