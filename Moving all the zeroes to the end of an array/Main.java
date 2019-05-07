import java.util.Scanner;
class Main 
{
  public static void rt(int a[],int n){
    int c=0;
    for(int i=0;i<n;i++){
     if(a[i]==0){c++;}
    }
      for(int i=0;i<n;i++){
        if(a[i]!=0){System.out.print(a[i]+" ");}
 }
    
     for(int i=0;i<c;i++){{System.out.print(0+" ");}}                   
  }
    
   public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){ a[i]=in.nextInt();}
        
    rt(a,n);
  	}
}