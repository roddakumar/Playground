import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      LinkedHashSet ls=new LinkedHashSet();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String s=br.readLine();
      String ar[]=s.split(",");
      for(int i=0;i<ar.length;i++){
        ls.add(ar[i]);
      }
      System.out.println(ls);
    }
}