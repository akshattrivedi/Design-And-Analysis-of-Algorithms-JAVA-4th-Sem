import java.util.*;

public class Shortest_Path{
	static int MAX_VALUE=200000;
	public int distance[]=new int[10];
	public int cost[][]=new int[10][10];
	static int INF_VAL=Integer.MAX_VALUE%10000;

	public void calcDist(int n,int s){
		int flag[]=new int[n+1];
		int minpos=1;
		int c;
		int minimum;
		int i;

		for(i=0;i<=n;i++){
			flag[i]=0;
			this.distance[i]=this.cost[s][i];
		}
		c=2;

		while(c<=n){
			minimum=INF_VAL;
			for(int k=1;k<=n;k++){
				if(this.distance[k]<minimum && flag[k]!=1)
				{
					minimum=this.distance[k];
					minpos=k;
				}
			}
			flag[minpos]=1;
			c++;

			for(int k=1;k<=n;k++){
				if(this.distance[minpos] + this.cost[minpos][k]< this.distance[k] && flag[k]!=1)
				{
					this.distance[k]=this.distance[minpos] + this.cost[minpos][k];
				}
			}
		}
	}//END OF THE CALCULATE DISTANCE FUNCTION

	public static void main(String args[])
	{
		int nodes,source,i,j;
		Scanner in= new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF NODES");
		nodes= in.nextInt();
		Shortest_Path d= new Shortest_Path();
		System.out.println("ENTER THE COST MATRIX WEIGHTS");

		for(i=1;i<=nodes;i++)
		{
			for(j=1;j<=nodes;j++)
			{
				d.cost[i][j]=in.nextInt();
				if(d.cost[i][j]==0)
					d.cost[i][j]=INF_VAL;
			}
		}
	System.out.println("ENTER THE SOURCE VERTEX");
	source=in.nextInt();
	d.calcDist(nodes,source);
	System.out.println("The Shortest Path cost from <"+ source +"> to all other vertices are:");
	System.out.println("Source"+ "\t" + "Dest" + "\t" +  "Cost");
	for(i=1;i<=nodes;i++)
	{
		if(i!=source)
		{
			System.out.println(source+ "\t" + i + "\t" + d.distance[i]);
		}
	}
	}//END OF THE MAIN FUNCTION
}// END OF THE CLASS SHORTEST PATH















