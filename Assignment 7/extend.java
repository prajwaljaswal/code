final class A
{
void show()
{
System.out.println("inside A");
}
}
class B extends A
{
void show(){
System.out.println("inside B");
}
}
class mainclass
{
public static void main(Sring[ ] args)
{
B b=new B();
b.show();
}
}