import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int val=1;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
          System.out.print(" ");
          }
        for(int k=1;k<=i;k++){
          System.out.print(val+" ");
          val=val+1;
        }System.out.print("\n");
}
    }}