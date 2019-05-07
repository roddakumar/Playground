import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int s=0;
	      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      while(n>0){
        s=s+n%10;
        n=n/10;
      }
      System.out.println(s);
    }
}