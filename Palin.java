import java.util.*;
import java.lang.*;
import java.io.*;
class Palin{  
 public static void main(String args[]){  
  
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int r,sum=0,temp;    
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("yes");    
  else    
   System.out.println("no");    
}  
}  
