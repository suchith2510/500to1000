import java.util.*;
import java.lang.*;
import java.io.*;

class TestScore
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(y%x==0&&(y/x)<=n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
	}
}

