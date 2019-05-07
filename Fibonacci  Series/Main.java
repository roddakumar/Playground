import java.io.*;
class Fibonacci extends Thread
{
int x,a=0,b=1,c;

public void run(){
    
    int loop=x-1;
    if(x>0){
        System.out.print("The Fibonacci series is :");
    System.out.print(a+" ");
while(loop>0){
System.out.print(b+" ");
c=a;
a=b;
b=c+b;
loop--;
}}
  else{System.out.println("Exception occurred");}
}
}

class Main
{
     public static void main(String[] args) throws IOException 
     {
     
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine());
       System.out.println("Enter the limit for Fibonacci: "+n);
       Fibonacci fb=new Fibonacci();
       fb.x=n;
       fb.start();
        }
     }
