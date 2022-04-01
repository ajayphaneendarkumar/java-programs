import java.io.*;
public class Weather
{
    public static void main(String[] args)throws Exception
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int temp;
        temp=Integer.parseInt(br.readLine());
        if(temp<0)
        {
            System.out.println("freezing wearther");
        }
        else if(temp>=0 && temp<10)
        {
            System.out.println("very cold weather");
            
        }
        else if(temp>=10 && temp<20)
        {
            System.out.println("cold weather ");
        }
        else if(temp>=20 && temp<30)
        {
            System.out.println("normal weather");
        }
        else if(temp>=30 && temp<40)
        {
            System.out.println("hot weather");
        }
        else
        {
            System.out.println("very hot weather");
        }
    }
}    