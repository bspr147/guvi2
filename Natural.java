/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Natural
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner sc=new Scanner(System.in);
 int m=sc.nextInt();
  //int n[100]=sc.nextInt();
  int sum=0;
  for(int i=1;i<=m;i++)
  {
  	sum=sum+i;
  }
  System.out.println(sum);
	}
}
