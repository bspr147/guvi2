
		
import java.util.Scanner;

 class Largeof
{
   public static void main(String args[])
   {
       int large,N,i;
       int arr[] = new int[100000];
       Scanner scan = new Scanner(System.in);
       N= scan.nextInt();
       for(i=0;i<N;i++)
       {
           arr[i] = scan.nextInt();
       }
       large = arr[0];
	   
       for(i=0;i<N;i++)
       {
           if(large < arr[i])
           {
               large = arr[i];
           }
          }
          System.out.print(large+" "); 
   }
}
