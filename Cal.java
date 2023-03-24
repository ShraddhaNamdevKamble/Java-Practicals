//write a program.create class calculation add methods addition,subtraction,multiplication and division to it.create objects and access those methods.

class calculation
{
  int a,b,result;
  
  calculation()
  {
   this.a=40;
   this.b=10;
  }
  void add()    //create add method
  {
    result=a+b;
	System.out.println("The addition of two numbers is:"+result);
  }
  void subtract()     //create subtract method
  {
    result=a-b;
	System.out.println("The subtraction of two numbers is:"+result);
  }
  void mul()     //create multiplication method
  {
    result=a*b;
	System.out.println("The multiplication of two numbers is:"+result);
  }
  void division()      //create division method
  {
    result=a/b;
	System.out.println("The division of two numbers is:"+result);
  }
}
class Cal
{
 public static void main(String args[])
 {
   calculation c=new calculation();   //instatization of class
   c.add();     //call add method
   c.subtract();  //call subtract method
   c.mul();      //call multiplication method
   c.division();  //call division method
 }
}