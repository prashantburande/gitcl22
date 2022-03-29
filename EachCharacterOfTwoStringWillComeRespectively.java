package string1;

import java.util.Scanner;

public class EachCharacterOfTwoStringWillComeRespectively {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String st1=sc.next();
		String st2=sc.next();
		String c=" ";
		
		int st1len=st1.length();
		int st2len=st2.length();
		int max=Integer.max(st1len,st2len);
		
		
		for(int i=0;i<max;i++)
		{
			if(i<st1len)
				c=c+ st1.charAt(i);
			if(i<st2len)
				c=c+ st2.charAt(i);
				
		}
		System.out.println(c);
	}

}
