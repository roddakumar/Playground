import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int c=0,sum=0,temp1=1;
      int temp=n,temp2=n;
      while(n>0){
        c=c+1;
        n=n/10;
      }
      while(temp>0){
       for(int i=1;i<=c;i++){
     temp1=temp1*(temp%10);
    }
     sum=sum+temp1;
        temp1=1;
        temp=temp/10;
      }
     if(sum==temp2)
       System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
    }
}
