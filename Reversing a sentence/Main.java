import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      String c=in.nextLine();
      StringBuilder sb=new StringBuilder(c);
      int end_idx=c.length();
      int start_idx=0;
      reverse_string(sb, start_idx, end_idx);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
      int n=end_idx-1;
        for(int i=end_idx-1;i>=start_idx;i--){
        if(sb.charAt(i)==' '){
        int index=i+1;
          
         for(int j=index;j<=n;j++){
          System.out.print(sb.charAt(j));
          }System.out.print(" ");n=i-1;
        }
       
        } for(int o=0;o<=n;o++) { System.out.print(sb.charAt(o));}
    }
}







