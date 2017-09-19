import java.util.*;

class exception{
	public static void main(String args[])
	{
		int a=7;
		int b=1;
		int c;

		try{
			c=a/b;
			System.out.println(c);
		}

		catch(ArithmeticException e)
		{
			System.out.println("ARITHMETIC EXCEPTION OCCURED");
			System.out.println("DIVISION ERROR");
			System.out.println("Exception:"+e);
		}

		finally{
			System.out.println("HERE COMES THE FINAL");
		}

		System.out.println("HERE COMES THE NORMAL EXECUTION");
	}//END OF THE MAIN FUNCTION
}// END OF THE MAIN CLASS EXCEPTION

