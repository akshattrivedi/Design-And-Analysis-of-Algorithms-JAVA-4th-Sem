import java.util.*;
import java.io.*;

class QuickSort{
	static int LOWER_VAL=1000;
	static int UPPER_VAL=1000000;
	static int STEP=100;
	static int BOUND=1000;
	int arr[];
	int size;

	public void readArrayValues(int size){
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		Random random=new Random();
		for(int i=0;i<size;i++)
		{
			arr[i]=random.nextInt(QuickSort.BOUND);
		}
	}

	public void qsort(int a[],int low,int high)
	{
		if(low<=high)
		{
			int pivot=partition(a,low,high);
			qsort(a,low,pivot-1);
			qsort(a,pivot+1,high);
		}
	}

	public int partition(int a[],int low,int high)
	{
		int p=arr[low];
		int i=low;
		int j=high+1;
		int temp;

		do{
			do{
				i++;
			}while(i!=high && arr[i]<p);

			do{
				j--;
			}while(j!=low && arr[i]>p);

			if(i<j)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}while(i<j);

		temp=arr[j];
		arr[j]=p;
		p=temp;

		return j;
	}

	public void plotGraph() throws IOException{
		File file = new File("plot.txt");
		FileWriter fileWriter= new FileWriter("plott.txt");
		QuickSort q=new QuickSort();
		long start_time,end_time;
		System.out.println("HI 1");
		for(int i=q.LOWER_VAL;i<=q.UPPER_VAL;i=i+q.STEP)
		{
			System.out.println(""+i);
			readArrayValues(i);
			start_time=System.currentTimeMillis();
		System.out.println("HI 1qqqqq");
			qsort(arr,0,i-1);
		System.out.println("HI 1rrrrrr");
			end_time=System.currentTimeMillis();
			System.out.println(""+i+"\t"+(end_time-start_time));
			fileWriter.write(""+i+""+(end_time-start_time)+"\n");
			fileWriter.flush();
		}

		System.out.println("HI 2");
		fileWriter.close();
	}

	public static void main(String args[]) throws IOException
	{
		QuickSort quick=new QuickSort();
		System.out.println("HI main1");
		quick.plotGraph();
		System.out.println("HI main2");
	}
}




			


