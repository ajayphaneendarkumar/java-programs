import java.io.*;
public class Typecasting{
    public static void main(String args[])throws Exception {
      InputStreamReader r=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(r);
      char ch;
      ch=(char)br.read();
      switch(ch)
      {
          case 'A': 
          case 'E': 
          case 'I': 
          case 'O': 
          case 'U': 
              System.out.println("vowel");
              break;
        default:
            System.out.println("not vowel");
            break;
      }
    }
}