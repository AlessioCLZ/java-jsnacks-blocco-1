package com.JANA60.jsnacksblocco1.controller.main;

import java.util.Scanner;

public class jSnack5 {

	public static void main(String[] args) 
	{
		Scanner keyboard= new Scanner(System.in);
		
		String word1, word2;
		String answer="";
		
		char[] word1Array, word2Array;
		
		
		do
		{
			int res=0;
			System.out.println("Insert a word:");
			word1= keyboard.nextLine();
			
			word1Array = word1.toCharArray();
			
			do
			{
				System.out.println("Insert a second word: ");
				word2= keyboard.nextLine();
				
				word2Array = word2.toCharArray();
				
				if (word2Array.length!=word1Array.length)
					System.out.println("The two words have not the same number of letters, please try again with a second word with the same number of letters as the first one.");
				
			}while(word2Array.length!=word1Array.length);
			
			for(int i=0;i<word1Array.length;i++)
			{
				if (word1Array[i]!=word2Array[i])
					res++;
			}
			
			System.out.println ("The Hamming distance of these two words is: " +res);
			
			do
			{
				System.out.println("Would you like to try again? ");
				answer= keyboard.nextLine();
				if(!answer.equalsIgnoreCase("yes")&&!answer.equalsIgnoreCase("no"))
					System.out.println("Wrong answer, please write yes or no.");
			}while(!answer.equalsIgnoreCase("yes")&&!answer.equalsIgnoreCase("no"));
		}while(answer.equalsIgnoreCase("yes"));
		
		System.out.println("Thank you, bye!");
		
		
		
		
		
		keyboard.close();
	}

}
