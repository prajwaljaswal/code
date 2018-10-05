class A
{
A()
{
System.out.println("Default Constructor");
}
A(int x)
{
this();
System.out.println(x);
}
}
class mainclass
{
public static void main(String[ ] args)
{
A a=new A(8);
}
}