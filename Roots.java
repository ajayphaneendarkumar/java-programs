import java.io.*;
public class Roots
{
    public static void main(String[] args)throws Exception
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int a,b,c;
        double root1,root2;
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
        double d=b*b-4*a*c;
        if(d>0)
        {
            root1=(-b+Math.sqrt(d))/(2*a);
            root2=(-b-Math.sqrt(d))/(2*a);
            System.out.printf("root1=%.2f and root2=%.2f",root1,root2); 
        }
        else if(d==0)
        {
            root1=root2=-b/(2*a);
            System.out.format("root1=root2=%.2f",root1);
        }
        else if(d<0)
        {
            double real=-b/(2*a);
            double img=Math.sqrt(-d)/(2*a);
            System.out.printf("root1=%.2f+i%.2f",real,img);
            System.out.format("root1=%.2f-i%.2f",real,img);
        }
        
    }
}    