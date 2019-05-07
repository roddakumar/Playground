import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      String s1=in.nextLine();
      String s2=in.nextLine();
      int n=in.nextInt();
      String a[]=s2.split(" ",n);
      for(String v:a){
        System.out.println(v);}
    }
}