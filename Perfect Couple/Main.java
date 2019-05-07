import java.util.Scanner;
class Main{
  public static void rt(int a[],int n,int v){
  
  for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
     int sum=a[i]+a[j];
      if(sum==v)
        System.out.println(a[i]+", "+a[j]);
      }
  }
  }
  
public static void main(String args[]){
  Scanner in=new Scanner(System.in);
   int n=in.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++){
   a[i]=in.nextInt();
  }
   int v=in.nextInt();
   rt(a,n,v);
} 
 }