//Write a program in java showing overloading of Add method with 2 and 3 parameters.
//In the user passes 2 values method with 2 parameter should be called if he passes 3 values method with 3 parameters should be called
package pack1;

import java.util.Scanner;

class Democlass
{
	public void add(int a,int b)
	{
		System.out.println("The 1st value is:"+a);
		System.out.println("The 2nd value is:"+b);
	}
	public void add(int a,int b,int c)
	{
		System.out.println("The 1st value is:"+a);
		System.out.println("The 2nd value is:"+b);
		System.out.println("The 3rd value is:"+c);
	}
}

public class OverloadingEx {

	public static void main(String[] args) {
		Democlass d1=new Democlass();
		//d1.add(30, 50);
		d1.add(19,45,89);
	    
		}

}
