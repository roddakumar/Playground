import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int s=0,last=0;
      last=n%10;
      while(n>100)
      {
        n=n/10;
      }
      s=n/10;
      System.out.println(s+last);
    }
}
      