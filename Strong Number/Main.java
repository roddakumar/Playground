import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int dup=n;
      int temp=0,tempfact=1,sum=0;
   while(n>0){
     temp=n%10;
      for(int i=1;i<=temp;i++){
        tempfact=tempfact*i;
      }
sum=sum+tempfact;
    n=n/10;
     tempfact=1;
    
 }
      if(sum==dup)
      System.out.println("Yes");
      else
        System.out.println("No");
}
}
