import java.util.*;
import java.lang.*;
import java.io.*;

class Cars
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n%4==0){
                System.out.println(n/4);
            }
            else{
                System.out.println(n/4+1);
            }
        }
	}
}
