import java.util.*;

class staffDetails{
	int staff_id;
	int phone;
	int salary;
	
	public void getDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STAFF ID:");
		staff_id=sc.nextInt();
		System.out.println("ENTER PHONE:");
		phone=sc.nextInt();
		System.out.println("ENTER SALARY:");
		salary=sc.nextInt();
	}

	public void printDetails()
	{
		System.out.println("STAFF_ID:"+staff_id+"\nPHONE:"+phone+"\nSALARY"+salary);
	}
}//END OF CLASS STAFF DETAILS

class Teaching extends staffDetails{
	String domain;
	String pub;

	public void getDetails()
	{

		super.getDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER DOMAIN:");
		domain=sc.next();
		System.out.println("ENTER PUBLICATION:");
		pub=sc.next();
	}
	
	public void printDetails(){
		super.printDetails();
		System.out.println("DOMAIN:"+domain+"\nPUBLICATION:"+pub);
	}
}//END OF THE CLASS TEACHING

class Technical extends staffDetails{
	int skills;

	public void getDetails()
	{
		super.getDetails();
		Scanner sc=new Scanner(System.in);
		skills=sc.nextInt();
	}

	public void printDetails(){
		super.printDetails();
		System.out.println("SKILLS:"+skills);
	}

}//END OF THE CLASS TECHNICAL


class Contract extends staffDetails{
	int period;

	public void getDetails(){
		super.getDetails();
		Scanner sc= new Scanner(System.in);
		period=sc.nextInt();
	}

	public void printDetails()
	{
		super.printDetails();
		System.out.println("PERIOD:"+period);
	}
}//END OF THE CLASS CONTRACT

class staff{
	public static void main(String args[])
	{
		int i;
		int t1_count;
		int t2_count;
		int c_count;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF TEACHING STAFF");
		t1_count=sc.nextInt();
		Teaching teach[]=new Teaching[t1_count];
		for(i=0;i<t1_count;i++)
		{
			teach[i]=new Teaching();
			teach[i].getDetails();
		}
		for(i=0;i<t1_count;i++)
		{
			teach[i].printDetails();
		}

		System.out.println("ENTER THE NUMBER OF TECHNICAL STAFF");
		t2_count=sc.nextInt();
		Technical tech[]=new Technical[t2_count];
		for(i=0;i<t2_count;i++)
		{
			tech[i]=new Technical();
			tech[i].getDetails();
		}
		for(i=0;i<t2_count;i++)
		{
			tech[i].printDetails();
		}

		System.out.println("ENTER THE NUMBER OF CONTRACT STAFF");
		c_count=sc.nextInt();
		Contract con[]=new Contract[c_count];
		for(i=0;i<c_count;i++)
		{
			con[i]=new Contract();
			con[i].getDetails();
		}

		for(i=0;i<c_count;i++)
		{
			con[i].printDetails();
		}
	}//END OF THE MAIN FUNCTION
}//END OF THE MAIN CLASS STAFF



