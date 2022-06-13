package com.JANA60.jsnacksblocco1.controller.main;

import java.util.Random;

public class jSnack3 {

	public static void main(String[] args) 
	{

		String[] names= {"Al", "John", "Jack"}, surnames={"Morbis", "Dorbis", "Forbis"}, list= new String [3];
		Random r= new Random();
		
		
		for(int i=0; i<list.length;i++)
		{
			String name= names[r.nextInt(names.length)];
			String surname = surnames[r.nextInt(surnames.length)];
			
			list[i] = name+ " " +surname;
			
			System.out.println(list[i]);		
		}
		
	}

}
