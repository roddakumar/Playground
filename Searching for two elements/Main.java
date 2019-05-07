import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
       int n=in.nextInt();
      int c1=0,c=0;
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
      }
      int a=in.nextInt();
      int b=in.nextInt();
      for(int i=0;i<n;i++){
      if(arr[i]==a){
        c=i;}
        if(arr[i]==b){
          c1=i;}
        }
      if(c!=0){
        System.out.println(c);}
      else{
        System.out.println("-1");
      }
      if(c1!=0){
        System.out.println(c1);}
      else{
        System.out.println("-1");
      }

     
    }
    }
  