package data;
public interface IPerson
{
	public void input();
	public void display();
}
-----------------------------------------------
package motor;
public interface IMotor
{
	public void inputInfor();
	public void displayInfor();
	public void changeInfor();
}
---------------------------------------------------

 package data.student;
 class Student extends Person
 {
 	float marks;
 	Student(int id, String name, float marks)
 	{
 		super(id,name);
 		marks=marks;
 	}
 }
 ------------------------------------------------------
  package data;
 import java.util.Scanner;
 class Person implements IPerson
{
	int id;
	String name;
	public Person(int id, String name)
	{
	id=id;
	name=name;
	}
	public void setId(int Number)
	{
		id=Number;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String ten)
	{
	name=ten;
	}
		public String getName()
	{
		return name;
	}
	
	public void input()
	{
		Scanner in=new Scanner (System.in);
		System.out.println("Nhap id: ");
		id=in.nextInt();
		System.out.println("Nhap ten: ");
		name=in.nextLine();
	}
	public void display()
	{
		System.out.print("Id: "+id+ "Hoten: "+ name);
	}
}
--------------------------------------------------------------------
package motor;
import java.util.Scanner;
class Motor implements IMotor
{
	String code;
	String name;
	double capacity;
	int num;
	public Motor( String code, String name, double capacity, int num)
	{
		code=code;
		name=name;
		capacity=capacity;
		num=num;
		
	}
		public void setCode(String ma)
	{			
		code=ma;
	}
	public String getCode()
	{
		return code;
	}
	
	public void setName(String ten){	
		name=ten;
	}
	public String getName()
	{
		return name;
	}
	//
	public void setCapacity(int dungtich){	
		capacity=dungtich;
	}
	public double  getCapacity()
	{
		return capacity;
	}
	//
	public void setNum(int kieutruyenluc){	
		num=kieutruyenluc;
	}
	public int  getNum()
	{
		return num;
	}	
	public void input()
	{
		Scanner in=new Scanner (System.in);
		System.out.println("Nhap code: ");
		code=in.nextString();
		System.out.println("Nhap ten: ");
		name=in.nextLine();
	}
	public void display()
	{
		System.out.print("Code: "+code+ "Hoten: "+ name);
	}	
		
		
		
		
		
		
		
}
