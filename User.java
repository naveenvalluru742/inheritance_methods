import java.util.Scanner;
class User extends Valluru{
	public static void main(String[] args){
	Scanner obj=new Scanner(System.in);

	System.out.println("enter vakue of a");
	int a=obj.nextInt();
	System.out.println("enter value  b");
	String b=obj.nextLine();

	Sai obj1=new Sai();
	obj1.Read(a,b);
	System.out.println("\n");

	Ram obj2=new Ram();
	obj2.Read(a,b);
	obj2.Write(a,b);
	System.out.println("\n");

	Valluru obj3=new Valluru();
	obj3.Read(a,b);
	obj3.Write(a,b);
	obj3.Edit(a,b);
}
}	