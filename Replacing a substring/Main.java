import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
     Scanner in=new Scanner(System.in);
      String s1=in.nextLine();
      String s2=in.nextLine();
      String s3=in.nextLine();
      String v=" ";
      String arr[]=s1.split(v);
      for(int i=0;i<arr.length;i++){
      String temp=arr[i];
        if(temp.contains(s2)){
        arr[i]=s3;
        }
      }
      for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
      }
    }
}