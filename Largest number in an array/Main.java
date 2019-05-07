import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
       int n=in.nextInt();
      int c[]=new int[10];
      int a[]=new int[100];
      for(int i=0;i<n;i++){
        a[i]=in.nextInt();}
      c[0]=a[0];
  for(int i=1;i<n;i++){
    
    if(c[0]<a[i]){
      c[0]=a[i];
    } 
    }
      System.out.print(c[0]);
    }
}