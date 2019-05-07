import java.util.Scanner;
class Main 
{
  public static void rt(int a[],int n,int r){
    int c1=0,c2=0,b1=0,b2=0,z=0;
     int a1[]=new int[n];
     int a2[]=new int[n];
      for(int i=0;i<n;i++){
     if(i%2==0){
    	 a1[c1]=a[i];
    	 c1++;
    	 }
   else{
	   a2[c2]=a[i];
	   c2++;
	   }
     }
   
      for(int i=0;i<r;i++){
 		 int temp=a2[0];
 		 for(int j=0;j<c2-1;j++) {
 			  a2[j]=a2[j+1];
 		 }a2[c2-1]=temp;   
	}
      
      for(int i=0;i<r;i++){
  		 int temp=a1[c1-1];
  		 for(int j=1;j<c1;j++) {                         //1 3 5 7 9
  			  a1[c1-j]=a1[c1-(j+1)];
  		 }a1[0]=temp;   
 	}
      
 
      for(int j=0;j<n;j++) {
    	  if(j%2==0) {
    		  System.out.print(a1[b1]+" ");b1++;}
    	  else {
    		  System.out.print(a2[b2]+" ");b2++;}
      }
  }
  
         
         
         
     public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){ a[i]=in.nextInt();}
        int r=in.nextInt();
    rt(a,n,r);
  	}
}