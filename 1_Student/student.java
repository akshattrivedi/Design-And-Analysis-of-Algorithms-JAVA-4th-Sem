import java.util.*;

class student{
	String usn;
	String name;
	String branch;
	int phone;

	public static void main (String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER THE NUMBER OF STUDENTS");
		n=sc.nextInt();
		student stud[]=new student[n];
		for(i=0;i<n;i++)
		{
			stud[i]=new student();
			stud[i].getDetails();
		}

		for(i=0;i<n;i++)
		{
			stud[i].printDetails();
		}
	}

	public void getDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER USN");
		usn=sc.next();
		System.out.println("ENTER NAME");
		name=sc.next();
		System.out.println("ENTER BRANCH");
		branch=sc.next();
		System.out.println("ENTER PHONE");
		phone=sc.nextInt();
	}

	public void printDetails()
	{
		System.out.println("\t\tUSN\tNAME\tBRANCH\tPHONE\n");
		System.out.println("\t\t"+usn+"\t"+name+"\t"+branch+"\t"+phone);
	}
}//END OF THE CLASS STUDENT

	
