import java.util.Scanner; 
 class Armrange
{ 
               public static void main(String args[]) 
            { 
               Scanner s=new Scanner(System.in); 
              // System.out.print("Enter the Range :"); 
               int b=s.nextInt(); 
               int range=s.nextInt(); 
               int a,c,sum,count=0; 
               //int b=s.nextInt(); 
               while(b<=range) 
                    { 
                        sum=0; 
                        c=b; 
                        while(c>0) 
                             { 
                                a=c%10; 
                                sum=sum+(a*a*a); 
                                c=c/10; 
                             } 
                         if(sum==b) 
                       { 
                         System.out.println(b+" "); 
                         //count=count+1; 
                       } 
                          b++; 
                     } 
//System.out.println("Total Armstrong Number Present With in that Range is "+count); 
                } 
} 
