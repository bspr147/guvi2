
import java.util.*;
import java.lang.*;
import java.io.*;
class Alphabet
{
	public static void main (String[] args) throws java.lang.Exception
  {
  Scanner sc=new Scanner(System.in);
   char n=sc.next().charAt(0);
   if( (n >= 'a' && n <= 'z') || (n >= 'A' && n <= 'Z'))
            System.out.println("Alphabet");
        else
            System.out.println("No");
    }

 
 }
