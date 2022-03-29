package string1;

import java.util.Scanner;

//Q 3 wap to compare two strings 

public class GFG {


 public static int stringCompare(String str1, String str2)
 {

     int l1 = str1.length();
     int l2 = str2.length();
     int lmin = Math.min(l1, l2);

     for (int i = 0; i < lmin; i++)
     {
         int str1_ch = (int)str1.charAt(i);
         int str2_ch = (int)str2.charAt(i);

         if (str1_ch != str2_ch)
         {
             return str1_ch - str2_ch;
         }
     }

     // String 1="Geeks" and String 2="Geeksforgeeks"
     if (l1 != l2)
     {
         return l1 - l2;
     }
     else 
     {
         return 0;
     }
 }

 public static void main(String args[])
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter a name");
     String s1 = s.next();
     System.out.println("Enter a name");
     String s2 = s.next();
     System.out.println("Enter a name");
     String s3 = s.next();
     System.out.println("Enter a name");
     String s4 = s.next();

     // Comparing for String 1 < String 2
     System.out.println("Comparing " + s1 + " and " + s2 
                        + " : " + stringCompare(s1, s2));

     // Comparing for String 3 = String 4
     System.out.println("Comparing " + s3 + " and " + s4
                        + " : " + stringCompare(s3, s4));

     // Comparing for String 1 > String 4
     System.out.println("Comparing " + s1 + " and " + s4
                        + " : " + stringCompare(s1, s4));
 }
}
