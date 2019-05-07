import java.util.Scanner;
class Main{
  public static int sum(int n){
    int a=0;
    for(int i=1;i<=n;i++){
      a=a+i;
  }return a;
  }
  
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=0;
      int n=in.nextInt();
      num=sum(n);
      System.out.print(num);
	}
}