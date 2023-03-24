//WAP to find if number is Odd or Even.

import java.util.Scanner;
class Odd_EvenEx
{
   public static void main(String args[])
   {
	   int n;
     //int num = 25;
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter a number:");
	 n=sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Given Number is Even");
        }
        else 
{
            System.out.println("Given Number is Odd");
        }
   }
}
	  