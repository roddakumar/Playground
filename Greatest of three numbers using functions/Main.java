import java.util.Scanner;
class Main{
  public static int g(int a,int b){
    if(a>b){return a;}
    else{
      return b;}
  }
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
       int c=in.nextInt();
       int d=g(a,b);
       int e=g(d,c);
      System.out.print(e);
	}
}