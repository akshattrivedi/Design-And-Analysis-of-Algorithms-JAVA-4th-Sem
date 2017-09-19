import java.util.*;
import java.lang.*;
import java.io.*;

class merge_sort{
	
	static int MAXSIZE=100000;
	static int a[]=new int [MAXSIZE];
	static String s=null;
	
	public void readArrayValues(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			Random rand=new Random();
			a[i]=rand.nextInt();
		}
	}


void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }


/*	void msort(int a[],int low,int high)
	{

//	void merge_sort(int a[],int low,int mid,int high)
//	{
		System.out.println("HERE");
		int b[]=new int[MAXSIZE];
		int h=low;
		int i=low;
		int mid = (high + low)/2;
		int j=mid+1;
		int k;
		while((h<=mid) && (j<=high))
		{
			if(a[h]<=a[j])
			{
				b[i]=a[h];
				h++;
			}
			else
			{
				b[i]=a[j];
				j++;
			}
			i++;
		}
		
		if(h>mid)
		{
			for(k=j;k<=high;k++)
			{
				b[i]=a[k];
				i++;
			}
		}
		else
		{
			for(k=h;k<=mid;k++)
			{
				a[k]=b[k];
			}
		}
//	}
	}
*/
	public void plotGraph() throws IOException
	{
		File file=new File("plot.txt");
		FileWriter wr = new FileWriter(file);
		BufferedWriter buf = new BufferedWriter(wr);
		//buf.write("Title Test: Sort Algorithm Analysis\n");
	//	buf.write("X Unit Test: Problem Size\n");
	//	buf.write("Y Unit Test: Time Taken in Milli-Seconds\n");
		
		for(int i=100;i<=MAXSIZE;i+=500)
		{
			readArrayValues(a,i);
			double timeBefore = System.currentTimeMillis();
			sort(a,0,i-1);
			double timeAfter = System.currentTimeMillis();
			double timeSpent = (timeAfter - timeBefore) * Math.pow(10,-3);
			buf.write(i+" "+timeSpent+"\n");
		}
		buf.close();
		
	/*	Process pr = Runtime.getRuntime().exec("xgraph plot.txt");
		BufferedReader br = new BufferedReader( new InputStreamReader(pr.getInputStream()) );
		
		while((s = br.readLine()) !=null)
		{
			System.out.println("THIS" + s);
		}
		br.close();
	*/
	//	Runtime.getRuntime().exec("xgraph plot.txt");
		Runtime.getRuntime().exec("man grep");	
	}
}



class MergeSort{

	public static void main(String args[]) throws IOException
	{
		merge_sort sort=new merge_sort();
		sort.plotGraph();
	}


	
	
}
