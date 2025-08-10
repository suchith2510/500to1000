import java.util.*;
import java.lang.*;
import java.io.*;
public class Average
{
	public static void main (String[] args) throws java.lang.Exception
{
		int a,b,c,t;
		Scanner read=new Scanner(System.in);
        t=read.nextInt();
        while(t-->0){
            a=read.nextInt();
            b=read.nextInt();
            c=read.nextInt();
            float avg=(float)(a+b)/2;
            if(avg>c){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
	}
}