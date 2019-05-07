
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
			}int m=in.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp1=arr[i];
					int temp2=arr[j];
					arr[i]=temp2;
					arr[j]=temp1;
					
				}
			}
			
		}
      
		System.out.print(arr[n-m]);
	}

}
