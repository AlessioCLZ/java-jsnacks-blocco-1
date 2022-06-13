package com.JANA60.jsnacksblocco1.controller.main;

import java.util.Scanner;

public class jSnack1 {

	public static void main(String[] args) {
		/*
		 * Il software deve chiedere per 5 volte all’utente di inserire un numero.
			Il programma stampa la somma di tutti i numeri inseriti.
			Esegui questo programma in due versioni, con il for e con il while.
		 */
		String answer="";
		int res=0;
		int[] numbers = {0,0,0,0,0};
		Scanner keyboard = new Scanner(System.in);
		do
		{
			for(int i=0;i<5;i++)
			{
				
				System.out.println("Please insert a number");	
				numbers[i]=Integer.parseInt(keyboard.nextLine());
				
			}
			
			for (int j=0;j<numbers.length;j++)
			{
				
				res+=numbers[j];
			}
			
			System.out.println("The sum of the number you gave is: " +res);
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
