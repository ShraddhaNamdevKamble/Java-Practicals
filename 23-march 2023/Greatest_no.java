//Write a program to take 3 numbers and fing the greatest of all 3 numbers.

class Greatest_no
{
  public static void main(String args[])
  {
   int A=100;      //data member
   int B=3;
   int C=900;
   
   if(A>B && A>C)   //Check if A is greater or not
   {
     System.out.println(A+" Given number is greater.");
   }
   else if(B>A && B>C)    //Check if B is greater or not
   {
	 System.out.println(B+" Given number is greater.");
   }
   else if(C>A && C>B)    //Check if C is greater or not
   {
     System.out.println(C+" Given number is greater.");
   }
   }
}