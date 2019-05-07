import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      String s=in.nextLine();
      int len=s.length();
      int a[]=new int[26];
    for(int i=0;i<len;i++){
      if(s.charAt(i)!=32)
      if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
    int offset=s.charAt(i)-'a';
      a[offset]++;}
      else{
      int offset=s.charAt(i)-'A';
        a[offset]++;
      }
         }
      for(int i=0;i<26;i++){
      if(a[i]==0){
      char c=(char)('a'+i);
        System.out.print(c+" ");
      }
      
      }
    }
}