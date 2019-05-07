import java.util.Scanner;
class Main
{
  public static int maxi(int a[],int n){int c=0;
 int g=a[0];
    for (int i=1;i<n;i++){
      if(g<a[i])
      { g=a[i];
       c=i;
      }
    }
    return c;
  }
  
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int [n];
    for(int i=0;i<n;i++){
      a[i]=in.nextInt();
    }
    int max=maxi(a,n);
    System.out.print(max);
  }
}