import java.util.*;

class Counts

    {
        public static void main(String arg[]){
        int sum=0;
        Scanner s=new Scanner(System.in);
        String val=s.nextLine();
        int len=val.length();
            for(int i=0;i<len;i++){
                if(val.charAt(i)==' ')
                    {
                       continue;
                    }
                    sum++;
                    }
                    System.out.println(sum);
                }
    }
