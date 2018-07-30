

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Odd
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int m=s.nextInt();
	for(int i=n;i<m;i++)
	{
		if(i%2==1)
		{
		System.out.print(i+" ");	
		}
	}

	}
}
