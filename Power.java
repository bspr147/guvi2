/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Power
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner in=new Scanner(System.in);
	    int x = in.nextInt();
	     int y = in.nextInt();
	     int sum=1;
	    for(int i=1;i<=y;i++)
	    {
	    	 sum=sum*x;
	    }
	    System.out.print(sum);
	}
}
