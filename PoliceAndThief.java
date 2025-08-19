import java.util.*;
import java.lang.*;
import java.io.*;

class PoliceAndThief
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int max=y;
		    int min=x;
		    if(x>y){
		        max=x;
		        min=y;
		    }
		    System.out.println(max-min);
		}

	}
}
