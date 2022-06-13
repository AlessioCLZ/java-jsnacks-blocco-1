package com.JANA60.jsnacksblocco1.controller.main;

public class jSnack3 {

	public static void main(String[] args) 
	{

		String[] names= {"Al", "John", "Jack"}, surnames={"Morbis", "Dorbis", "Forbis"};
		
		
		
		for(int i=0; i<3;i++)
		{
			String res="";
			res=names[i]+ " " + surnames[i];
			System.out.println("Guest name: "+res);
		}
		
	}

}
