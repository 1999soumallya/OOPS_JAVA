class politician
{
	float Salary;
	politician()
	{
		Salary = (float)0.1*Salary;
	}
	void display(float NetSalary, String TOE)
	{
		Salary=NetSalary;
		System.out.println("Salary of " + TOE + "is: " + NetSalary);
	}
}
class Employee1 extends employees
{
	float Calculation(float Salar)
	{
		//Salary = Salar;
		return Salar;
	}
	float Calculation(float Salar, float parks)
	{
		//Salary=Salar;
		//Salar = Salary + (float)parks;
		return Salar;
	}
}
class CalSalary
{
	public static void main(String args[])
	{  
		/*float NetSalary1,NetSalary2,NetSalary3,NetSalary4;
		Employee1 Emp1=new Employee1();
		Employee1 Emp2=new Employee1();
		Employee1 Emp3=new Employee1();
		Employee1 Emp4=new Employee1();

		NetSalary1 = Emp1.Calculation(10000);
		NetSalary2 = Emp2.Calculation(20000);
		NetSalary3 = Emp3.Calculation(10000,2000);
		NetSalary4 = Emp4.Calculation(5000,1000);

		Emp1.display(NetSalary1,"Programmer");
		Emp2.display(NetSalary2,"Manager");
		Emp3.display(NetSalary3,"Analyst");
		Emp4.display(NetSalary4,"House Keeping");*/
	}
}