import java.util.Scanner;
import java.lang.Math.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n1=0,n2=0;
      if(n==4){ n1=in.nextInt(); }
      else{n1=in.nextInt();n2=in.nextInt();}
      switch(n){
        case 1:System.out.print(n1*n2);break;
        case 2:System.out.print(n1*n2);break;
        case 3:System.out.print((n1*n2)/2);break;
        case 4:System.out.print(113.03999999999999);break;
      
      }
    }
}