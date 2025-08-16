import java.util.*;
import java.lang.*;
import java.io.*;

class Tastiness
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int a,b,c,d,dish1,dish2;
		while(t-->0){
		     a=sc.nextInt();
		     b=sc.nextInt();
		     c=sc.nextInt();
		     d=sc.nextInt();
		     dish1=a;
		     dish2=c;
		    if(b>a){
		        dish1=b;
		    }
		    if(d>c){
		        dish2=d;
		    }
		    System.out.println(dish1+dish2);
		}

	}
}
