import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int s=0,dup=0;
      int c=2;
      while(n>0)
      {
        dup=(dup*10)+n%10;
        n=n/10;
      }
      while(c>0){
        s=dup%10;
        dup=dup/10;
        c=c-1;
      }
      System.out.println(s);
    }
}
      