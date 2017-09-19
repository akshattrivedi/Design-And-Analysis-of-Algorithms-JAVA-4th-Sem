//PROGRAM TO ENTER STUDENT DETAILS AND PRINT THOSE DETAILS
#include<stdio.h>


typedef struct STUDENT{
	char usn[20];
	char name[20];
	int marks;
	int age;
}stud;

int main()
{
	int i,n;
	printf("\nENTER THE NUMBER OF STUDENTS\n");
	scanf("%d",&n);
	stud s[n];
	for(i=0;i<n;i++)
	{
		printf("\nENTER THE DETAILS OF STUDENT (%d)\n",i+1);
		printf("\nENTER USN:\t");
		scanf("%s",s[i].usn);	
		printf("ENTER NAME:\t");
		scanf("%s",s[i].name);
		printf("ENTER MARKS:\t");
		scanf("%d",&s[i].marks);
		printf("ENTER AGE:\t");
		scanf("%d",&s[i].age);
	}
	
	printf("\nS.NO.\t\tUSN\t\tNAME\t\tMARKS\t\tAGE\t\t\n");
	for(i=0;i<n;i++)
	{
		printf("\n%d\t\t%s\t\t%s\t\t%d\t\t%d",i+1,s[i].usn,s[i].name,s[i].marks,s[i].age);
	}
	printf("\n\n");
	

return 0;
}//END OF THE MAIN FUNCTION
