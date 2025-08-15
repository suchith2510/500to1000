import java.util.*;
import java.lang.*;
import java.io.*;

class DiscussThrow
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int max=a;
		    if(b>=a&&b>=c){
		        max=b;
		    }
		    else if(c>=a&&c>=b){
		        max=c;
		    }
		    System.out.println(max);
		}
	}
}

