class X
{
void show()
{
System.out.println("VINAY DHYANI ");
}
}
class Y extends X
{
void show1()
{
System.out.println("TELL MORE ABOUT VINAY ");
}
}
interface P
{
void parents(String f_nm,String m_nm);
}
interface Q extends P
{
void sister(String s_nm,String si_nm);
}
class Z extends Y implements Q
{
public void parents(String f_nm,String m_nm)
{
System.out.println(" FATHER NAME "+f_nm);
System.out.println(" MOTHER NAME "+m_nm);
}
public void sister(String s_nm,String si_nm)
{
System.out.println(" SISTERS "+s_nm+si_nm);
}
public static void main(String ar[])
{
Z z=new Z();
z.show();
z.show1();
z.parents(" KAMLESH DHYANI "," BABITA DHYANI ");
z.sister(" SHILPI DHYANI ","VANSHIKA DHYANI ");
}
}