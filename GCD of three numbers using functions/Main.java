import java.util.Scanner;
public class Main{
  public static int g(int a,int b){
    int temp=0,g=0;
     if(a>b){
    while(b>0){
      temp=b;
      b=a%b;
      a=temp;}g=a;
  }
    
      if(b>a){
    while(a>0){
      temp=a;
      a=a%b;
      b=temp;}g=b;
  }
    return g;
  }
	public static void main (String[] args)
	{
	     Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
       int c=in.nextInt();
       int d=g(a,b);
       int e=g(d,c);
      System.out.print(e);
     
	}
}