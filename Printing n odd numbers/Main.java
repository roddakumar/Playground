import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
       int c=0;
      for(int i=1;c<n;i++){
        if(i%2!=0){
          c=c+1;
          System.out.println(i);
        }
      }
    }
}