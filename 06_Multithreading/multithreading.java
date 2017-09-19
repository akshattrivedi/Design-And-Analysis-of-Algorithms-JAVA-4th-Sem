import java.util.*;

class Values{
	static int num;
	static int sq;
	static int cube;
}

class generateNumber extends Thread{
	public void run(){
		Random rand=new Random();
		Values.num=rand.nextInt(100);
		System.out.println("NUMBER:"+Values.num);

		findSquare s= new findSquare();
		findCube c=new findCube();

		s.start();
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException e){}

		c.start();
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException e){}

	}
}

class findSquare extends Thread{
	public void run()
	{
		Values.sq=Values.num*Values.num;
		System.out.println("SQUARE:"+Values.sq);
	}
}

class findCube extends Thread{
	public void run()
	{
		Values.cube=Values.num*Values.num*Values.num;
		System.out.println("CUBE:"+Values.cube);
	}
}

class multithreading{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("ENTER THE NUMBER OF THREADS");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			generateNumber g=new generateNumber();
			g.start();
			try{
				Thread.sleep(5000);
				g.join();
			}
			catch(InterruptedException e){}
		}
	}
}






