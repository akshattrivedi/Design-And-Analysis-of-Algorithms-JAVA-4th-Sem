import java.io.*;
import java.lang.Exception;
import java.lang.String;

class Exception_Handling{
	public static void main(String args[]) {
		int a=20;
		int b=0;
		String s=null;
		try{
			System.out.println(a/b);
			System.out.println(s.length());
		}
		catch(ArithmeticException exc){
			System.out.println(exc.toString());
			exc.printStackTrace();
		}
/*		catch(NullPointerException ex)
		{
			System.out.println(s.length());
		}
*/
		finally{
			System.out.println("Code After Exception");
		}

		System.out.println("HERE!");
	}
}
