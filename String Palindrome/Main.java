import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      int count=0;
        Scanner in=new Scanner(System.in);
       String c=in.nextLine();
      int n=c.length();
      int j=n-1;
      for(int i=0;i<n/2;i++){
        if(c.charAt(i)==c.charAt(j)){
          count=count+1;
         j=j-1;
     }else
        {
           count=0; 
          break;
        } 
}
      if(count!=0)
      {
        System.out.print("Yes");}
      else{System.out.print("No");}
    }
}