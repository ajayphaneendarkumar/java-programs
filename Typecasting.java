import java.io.*;
public class Colorcode{
    public static void main(String args[])throws Exception {
      InputStreamReader r=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(r);
      char ch;
      ch=(char)br.read();
      switch(ch)
      {
          case 'V': System.out.println("voilet");
              break;
          case 'I': System.out.println("indigo");
              break;
          case 'B': System.out.println("blue");
              break;
          case 'G': System.out.println("green");
              break;
          case 'Y': System.out.println("yellow");
              break;
        case 'O': System.out.println("orange");
              break;
        case 'R':
              System.out.println("red");
              break;
        default:
            System.out.println("empty colors");
            break;
      }
    }
}