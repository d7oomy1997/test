
public class Constructors1 {
//default constructor
	int id; String name;

void hh() {
	System.out.println(id+" "+name);
}
public static void main(String[] args) {
	Constructors1 U1=new Constructors1();
	Constructors1 U2=new Constructors1();
	U1.hh();
	U2.hh();
}
}
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

 class paramConstrDemo {
public static void main(String[] args) {

	Std std1=new Std(2,"Alex");
	Std std2=new Std(10,"Annie");
	std1.display();
	std2.display();
		}
}
