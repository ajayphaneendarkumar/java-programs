import java.io.*;
public class Season{
    public static void main(String args[])throws Exception {
              
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
         int n;
         n=Integer.parseInt(br.readLine());
         if(n==3||n==4||n==5)
         {
             System.out.println("Summer");
         }
         else if(n==6||n==7||n==8||n==9)
         {
               System.out.println("Rainy");
         }
         else if(n==10||n==11||n==12)
         {
               System.out.println("Winter");
         }
         else
         {
               System.out.println("fog");
         }
    }
}