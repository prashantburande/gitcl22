//Q 7 wap to count number of words in given string
package string1;
import java.util.Scanner;

public class StringWordCounter {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string ");
		String str=sc.nextLine();
		int count=1;
	
		for(int i=0;i<str.length()-1;i++) 
		{
			if(str.charAt(i)==" ") && (str.charAt(i+1)!="  " )
			{
				count++; 
			}
		}	
	
	
	System.out.println("Total words" +count);	   
	
	}
}
	   