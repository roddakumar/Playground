import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
		int n=in.nextInt();
      int l=n-1;
		int arr[]=new int[n];
      boolean flag=true;
      for(int i=0;i<n;i++) {arr[i]=in.nextInt();}
      for(int j=0;j<n/2;j++){
      if(arr[j]!=arr[l]){flag=false;break;}l--;
      }
      if(flag==true){System.out.print("Yes");}else{System.out.print("No");}
    }
}