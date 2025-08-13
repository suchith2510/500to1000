import java.util.*;
import java.lang.*;
import java.io.*;

class Exams
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int x,y,z;
        while(t-->0){
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            if(x*y/2<z){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
	}
}
