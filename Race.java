import java.io.*;
public class Race
{
    public static void main(String[] args)throws Exception
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new  BufferedReader(r);
        int R1,R2,R3,R4,R5;
        float avg;
        R1=Integer.parseInt(br.readLine());
        R2=Integer.parseInt(br.readLine());
        R3=Integer.parseInt(br.readLine());
        R4=Integer.parseInt(br.readLine());
        R5=Integer.parseInt(br.readLine());
        avg=(R1+R2+R3+R4+R5)/5;
        if(R1>avg)
        {
            System.out.println("R1 is Qualified");
            
        }
        if(R2>avg)
        {
            System.out.println("R2 is Qualified");
        }
        if(R3>avg)
        {
            System.out.println("R3 is Qualified");
        }
        if(R4>avg)
        {
            System.out.println("R4 is Qualified");
        }
        if(R5>avg)
        {
            System.out.println("R5 is Qualified");
        }
    }
}