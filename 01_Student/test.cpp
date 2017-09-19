#include<iostream>
#include<string.h>
using namespace std;
class stud{
	char usn[20];
	char name[20];
	int marks;
	int age;
	public :void getData(){
				cout<<"Enter student data\n";
				cout<<"USN\tname\tmarks\tage\n";
				cin>>usn;
				cin>>name;
				cin>>marks;
				cin>>age;
		}
	public :void displayData(){
				cout<<"Student data:\n";
				cout<<"USN\tname\tmarks\tage\n";
				cout<<usn<<"\t"<<name<<"\t"<<marks<<"\t"<<age<<"\t"<<"\n";
		}

};
int main(){
	int i,n;
	cout<<"Enter number of students:\n";
	cin>>n;
	stud student[10];
	for(int i=0;i<n;i++)	
		student[i].getData();
	for(i=0;i<n;i++)
		student[i].displayData();
	return 0;
}
