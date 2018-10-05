class parent{  
void func(){
System.out.println("hello world");
}  
}  
class child extends parent{  
void func(){
System.out.println("hello Pranay");
}  
void fun(){
System.out.println("Napstar");
}  
void display(){ 
fun(); 
super.func();   
}  
}  
class mainclass{  
public static void main(String[ ] args){  
child c=new child();  
c.display();  
}
}