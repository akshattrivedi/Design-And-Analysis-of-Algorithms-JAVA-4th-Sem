import java.util.*;

class stringTokenizer{
	static	String name;
	static String date_of_birth;
	static String dd,mm,yy;

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NAME:");
		name=sc.next();
		System.out.println("ENTER THE DATE OF BIRTH IN DD/MM/YYYY FORMAT:");
		date_of_birth=sc.next();
		StringTokenizer st=new StringTokenizer(date_of_birth,"/");
		dd=st.nextToken();
		mm=st.nextToken();
		yy=st.nextToken();
		System.out.println("NAME:"+name+","+dd+","+mm+","+yy);
	}//END OF THE MAIN FUNCTION
}//END OF THE MAIN CLASS STRING TOKENIZER
		
