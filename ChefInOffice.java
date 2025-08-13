import java.util.*;
import java.lang.*;
import java.io.*;

class ChefInOffice
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int k = (4*x) + y;
		    System.out.println(k);
		}
	}
}