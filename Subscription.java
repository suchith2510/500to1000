import java.util.*;
import java.lang.*;
import java.io.*;

public class Subscription
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x,n;
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int res;
        while(t-->0){
            n=sc.nextInt();
            x=sc.nextInt();
            if(n%6==0){
                res=n/6;
            }
            else{
                res=n/6+1;
            }
            System.out.println(x*res);
        }
	}
}

