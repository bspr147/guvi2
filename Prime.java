/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Prime
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int count=0;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			count++;
			break;
		}
		
		
		
	}
	if(count==0)
	{
		System.out.print("yes");
		
	}
	else
	{
		System.out.print("no");
	}
	}
}
