import java.util.*;
import java.lang.*;
import java.io.*;

public class Assignment
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n;
        int t=sc.nextInt();
        while(t-->0){
            n=sc.nextInt();
            if(n+3<=10)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
	}
}
