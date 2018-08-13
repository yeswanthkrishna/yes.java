/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class largeofthreenumbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x,y,z;
		System.out.println("enter the three integres");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		if( x > y && x > z )
			System.out.println("frist number is largest");
		else if( y > x && y > z)
			System.out.println("second number is largest");
		else if( z > x && z > y )
			System.out.println("third number is largest");
		else
			System.out.println("enter no are not distent");
	}
}
