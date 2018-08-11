/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Time1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int x=s.nextInt();
		int b=s.nextInt();
		int y=s.nextInt();
		int hr=(a-b);
		int min=(x-y);
		System.out.print(Math.abs(hr)+" "+Math.abs(min));
		
	}
}
