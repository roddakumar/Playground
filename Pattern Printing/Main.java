import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in=new Scanner(System.in);
      int r=in.nextInt();
      int c=in.nextInt();
      int a[][]=new int[r+1][c+1];
      for(int i=1;i<=r;i++){
        for(int j=1;j<=c;j++){
      a[i][j]=j;
    }
}
      for(int i=1;i<=r;i++){
        for(int j=1;j<=i;j++){
       a[i][j]=i;   
        }
      }
      
for(int i=r;i>0;i--){
        for(int j=c;j>0;j--){
          System.out.print(a[i][j]);
        }System.out.println();
}
      
    }
}