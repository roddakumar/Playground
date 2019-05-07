import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
      int val=0;
      for(int i=0;i<n;i++) {arr[i]=in.nextInt();}
      for(int j=1;j<=n;j++){
      for(int k=0;k<n;k++){
      if(arr[k]==j){
      val=0;
      break;
      }else
      {
      val=j;
      }
      }if(val!=0){System.out.print(val);}
      }
      
    }
}