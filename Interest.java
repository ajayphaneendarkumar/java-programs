import java.io.*;
public class Interest
{
    public static void main(String args[])throws Exception
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int P,T,R;
        P=Integer.parseInt(br.readLine());
        T=Integer.parseInt(br.readLine());
        R=Integer.parseInt(br.readLine());
        float I=(P*T*R)/100;
        System.out.println(I);
        
    }
}