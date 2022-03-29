//Q 5 wap to check if string is palindrome or not 
package string1;

import java.util.Scanner;

public class PalindromeExample
{
  
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string name");
		String str=sc.next();
	    
	   int length=str.length();
	   int i,j;
	   
	   for(i=0,j=length-1;i<length/2;i++,j++)
	   {
		   if(str.charAt(i)!=str.charAt(j))
           flag=1;
           break;
	   }
	
	 if(flag==1)
	{
		System.out.println("not a palindrome");
	}
	else 
	{
		System.out.println(" palindrome");
	}
}}