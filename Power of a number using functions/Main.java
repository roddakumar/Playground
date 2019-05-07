import java.util.Scanner;
public class Main{
  public  static int power(int b,int e){
    int val=b;
    for(int i=1;i<=e-1;i++){
      
      val=val*b;
    }return val;
  }
  public static void main(String a[]){
   Scanner in=new Scanner(System.in);
    int base=in.nextInt();
    int exponent=in.nextInt();
   
    int val=power(base,exponent);
   System.out.print(val);
  }
}