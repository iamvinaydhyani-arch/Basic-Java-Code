import java.util.*;
class College
{
	String col_nm;
	int yr_estd;
	Scanner scr;
void GetData()
{
	scr=new Scanner(System.in);
	System.out.println("ENTER COLLEGE NAME ");
	col_nm=scr.nextLine();
	System.out.println("ENTER YEAR ESTABLISHED");
	yr_estd=scr.nextInt();
}
void ShowData()
{
	System.out.println("COLLEGE NAME "+ col_nm);
	System.out.println("YEAR ESTABLISHED "+yr_estd);
}
}
	class Student extends College
{
	int roll;
	String snm;
void GetData1()
{
	System.out.println("ENTER ROLL NUMBER ");
	roll=scr.nextInt();
	System.out.println("ENTER STUDENT NAME ");
	snm=scr.next();
}
	void ShowData1()
{
System.out.println("ROLL NO "+roll);
System.out.println("NAME "+snm);
}
	public static void main(String ar[])
{
	Student s1=new Student();
	s1.GetData();	
	s1.GetData1();
	s1.ShowData();
	s1.ShowData();
}
}
