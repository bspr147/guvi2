/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Revstr
{

public static void main(String ar[]){
	Scanner s=new Scanner(System.in);
String str= s.next();
for(int i=str.length()-1; i>=0;i-- ){
System.out.print(str.charAt(i)); 
}
}
}
