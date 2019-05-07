import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in=new Scanner(System.in);
      int b=in.nextInt();
      int e=in.nextInt();
      int res=1,c=0;
      while(c<e){
      res=res*b;
        c++;
      }
      System.out.print(res);
    }
}