import java.util.*;

public class customer{
	String name;
	String date_of_birth;
	String dd,mm,yy;
	public void accept()
	{
		System.out.println("ENTER NAME");
		name=System.console().readLine();
		System.out.println("ENTER DATE OF BIRTH IN THE FORMAT DD/MM/YYYY");
		date_of_birth=System.console().readLine();
	}

	public void display()
	{
		System.out.println(name + " ," + dd + "," + mm + "," +yy);
	}

	public void delimit()
	{
		StringTokenizer st = new StringTokenizer(date_of_birth,"/");
		dd=st.nextToken();
		mm=st.nextToken();
		yy=st.nextToken();
	}

	public static void main(String args[])
	{
		customer c = new customer();
		c.accept();
		c.delimit();
		c.display();
	}//END OF THE MAIN FUNCTION
}// END OF THE CLASS CUSTOMER
