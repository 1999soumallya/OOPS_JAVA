import java.util.Scanner;
class Animal
{  
	String n;	
	//Scanner sc = new Scanner(System.in);
	public void eat()
	{
		System.out.println("Enter a String:");
		Scanner sc = new Scanner(System.in);
		n=sc.next();		
		//System.out.println(n);
		sc.close();
	}  
}  
class Dog extends Animal
{  
	int j=20;
	void bark()
	{
		System.out.println(super.n);
		System.out.println("barking...");
	}
}  
class BabyDog extends Dog
{  
	
	void weep()
	{
		System.out.println(super.n);
		System.out.println("weeping...");
	}
} 
class InheritanceMultilevel
{  
	public static void main(String args[])
	{  
		BabyDog d=new BabyDog();    
		d.eat(); 
		System.out.println("The output is: "); 	
		d.bark();
		d.weep();
	}
}  