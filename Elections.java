import java.util.*;
import java.lang.*;
import java.io.*;

class Elections
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int[] arr=new int[n];
		    int eligible=0;
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		        if(arr[i]>=x){
		            eligible++;
		        }
		    }
		    System.out.println(eligible);
		    
		}

	}
}
