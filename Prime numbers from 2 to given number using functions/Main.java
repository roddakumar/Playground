import java.util.Scanner;
class Main{
   public  static int  prime(int n){
    int c=0;
      for(int j=2;j<=n/2;j++){
        if(n%j==0){
          c=1;
        }
      }
    return c;
    }
 
  
	public static void main(String[] args){
	    int num=0;
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      for(int i=2;i<=n;i++){
        num=prime(i);
        if(num==0){
          System.out.println(i);
	}num=0;
}
}
}