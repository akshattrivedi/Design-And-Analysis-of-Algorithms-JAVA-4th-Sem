import java.util.*;

class stackOps{
	int MAXSIZE;
	int st[]=new int[20];
	int top=-1;

	public void getSize(){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF THE STACK");
		MAXSIZE=sc.nextInt();
	}

	public void push(){
		Scanner sc=new Scanner(System.in);
		if(top==(MAXSIZE-1))
		{
			System.out.println("STACK OVERFLOW !");
			return;
		}
		else
		{
			System.out.println("ENTER NEW ELEMENT");
			int new_ele=sc.nextInt();
			top++;
			st[top]=new_ele;
		}
	}

	public void pop(){
		if(top==-1)
		{
			System.out.println("STACK UNDERFLOW !");
			return;
		}
		else
		{
			System.out.println("POPPED ELEMENT=\t"+st[top]);
			top--;
		}
	}

	public void display(){
		if(top==-1)
		{
			System.out.println("NO ELEMENTS TO DISPLAY");
			return;
		}
		else
		{
			for(int i=0;i<=top;i++)
			{
				System.out.println("\t"+st[i]);
			}
		}
	}
}//END OF THE CLASS STACK OPERATIONS

class stack{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		stackOps stack = new stackOps();
		stack.getSize();
		int choice;
		for(;;)
		{
			System.out.println();
			System.out.println("STACK OPERATIONS");
			System.out.println("-------------------------------------------------");
			System.out.println("1) PUSH\n2) POP\n3) DISPLAY\n4) EXIT");
			System.out.println("-------------------------------------------------");
			System.out.println("ENTER YOUR CHOICE:\t");
			choice=sc.nextInt();

			switch(choice)
			{
				case 1:	stack.push();
				break;
				case 2: stack.pop();
				break;
				case 3: stack.display();
				break;
				case 4:	System.exit(0);
				break;
				default: System.out.println("RE-ENTER YOUR CHOICE");
			}
			System.out.println();
		}
	}
}//END OF THE MAIN CLASS STACK

