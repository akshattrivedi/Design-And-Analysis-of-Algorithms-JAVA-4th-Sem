import java.util.*;

class stackOps{
	int stack[]=new int[20];
	int top=-1;

	int MAXSIZE;

	stackOps(int size)
	{
		MAXSIZE=size;
	}

	public void push()
	{
		int new_ele;
		if(top==MAXSIZE)
		{
			System.out.println("STACK OVERFLOW !!");
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER THE NEW ELEMENT");
			new_ele=sc.nextInt();
			stack[++top]=new_ele;
		}
	}

	public void pop(){
		int pop_ele;
		if(top==-1)
		{
			System.out.println("STACK UNDERFLOW!!");
		}
		else
		{
			pop_ele=stack[top];
			top--;
			System.out.println("POPPED ELEMENT="+pop_ele);
		}
	}

	public void display(){
		int i;
		for(i=0;i<=top;i++)
		{
			System.out.println("\t"+stack[i]);
		}
	}
}

class stacky{
	public static void main(String args[])
	{
		int size;
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF THE STACK");
		size = sc.nextInt();
		stackOps ops = new stackOps(size);

		for(;;)
		{
			System.out.println("1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT\n");
			System.out.println("ENTER CHOICE:");
			choice=sc.nextInt();

			switch(choice)
			{
				case 1:	
					ops.push();

					break;
				case 2:
					ops.pop();

					break;
				case 3: 
					ops.display();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("PLEASE RE-ENTER THE CHOICE");
			}
		}
	}//END OF THE MAIN FUNCTION
}//END OF THE MAIN CLASS STACKY






