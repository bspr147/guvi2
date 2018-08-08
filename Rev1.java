/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Rev1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		int rev,rem;
		while(n>0)
		{
	             rem=n%10;
	             sum=(sum*10)+rem;
	             n=n/10;
		}
		System.out.print(sum);
	}
}
