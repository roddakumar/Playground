import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner in=new Scanner (System.in);
      String s1=in.nextLine();
      String s2=in.nextLine();
      String s3=s1.concat(s1);
      int c=0;
      boolean f=false;
      for(int i=0;i<=(s3.length()-s2.length());i++){
      int k=i;
        for(int j=0;j<s2.length();j++){
        if(s3.charAt(k)==s2.charAt(j)){
        c=c+1;
          if(c==s2.length()){System.out.print("Yes");
                            f=true;}
          k++;
        }
        }c=0;
      
      }if(f!=true){System.out.print("No");}
    }
}