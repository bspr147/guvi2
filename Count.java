/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Count
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner sc=new Scanner(System.in);
 int m=sc.nextInt();
 int count=0;
  
 // int sum=0;
  while(m!=0)
  
  {
          m=m/10;
          count++;
 
  }
  System.out.println(count);
	}
}
