/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class leapyear
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int year;
		Scanner scan=new Scanner(System.in);
		year=scan.nextInt();
		if(year % 4==0)
			System.out.println("yes");
		else
			System.out.println("no");
		
	}
}
