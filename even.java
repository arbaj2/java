import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int a;
      System.out.println("Please enter a number to check even or odd:");
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();

      if(a % 2 == 0)
      {
         System.out.println("Entered number is an even number");
      }
      else
      {
         System.out.println("Entered number is an odd number");
      }
	}
}
