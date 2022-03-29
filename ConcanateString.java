//assignment 2 Q 2 Write a Java program to concatenate a given string to 
//the end of another string
package string1;
import java.util.Scanner;
class ConcanateString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String str1=s.next();
		String str2=s.next();
		System.out.println(str1+"  "+str2);//important
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.concat(str2));
		System.out.println(str1.indexOf(2));
		System.out.println(str1.length());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.compareTo(str2));
	}

}
