import java.util.Scanner ;
 
class Journey
{
	String rid_nm ,bik_nm,jr_fr,jr_to;
	int tl_km;
	int pet;
	float bike_avg;
Scanner scr;
	void get()

{
scr=new Scanner(System.in);

	System.out.println("RIDER NAME , BIKE NAME , JOURNEY FROM , JOURNEY TO ,TOTAK KM , BIKE AVG ");
	rid_nm=scr.nextLine();
	bik_nm=scr.next();
	jr_fr=scr.next();
	jr_to=scr.next();
	tl_km=scr.nextInt();
	bike_avg=scr.nextFloat();
}
void show()
{
System.out.println("RIDER NAME "+rid_nm);
System.out.println("BIKE NAME "+bik_nm);
System.out.println("JOURNEY FROM "+jr_fr);
System.out.println("JOURNEY TO "+jr_to);
System.out.println("TOTAL KM "+tl_km);
System.out.println("BIKE AVERAGE "+bike_avg);
float petrol_ltr=tl_km/bike_avg;
System.out.println("PETROL USED "+petrol_ltr);
}
	public static void main(String ar[])
{
Journey j=new Journey ();
j.get();
j.show();
}
}




