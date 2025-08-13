import java.util.*;
import java.lang.*;
import java.io.*;

class Mahasena
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        
        int lucky = 0, unlucky=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0) lucky++;
            else unlucky++;
        }
	    if(lucky>unlucky) System.out.println("READY FOR BATTLE");
	    else System.out.println("NOT READY");
	}
}