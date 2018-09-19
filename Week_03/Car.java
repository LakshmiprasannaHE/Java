class Car
{
	String car_name;
	String car_model;
	String car_color;
	Car(String name,String model,String color)
	{
		car_name=name;
		car_model=model;
		car_color=color;
	}
	void speed()
	{
		System.out.println("Speed : 20");
	}
	void printdetails()
	{	
		System.out.println("Car name :"+car_name);
		System.out.println("Car model :"+car_model);
		System.out.println("Car color :"+car_color);
	}
}
class FamilyCar extends Car
{
	int no_seats;
	int no_doors;
	double price;
	FamilyCar(String name, String model, String color,int seats,int doors,double p) {
		super(name, model, color);
		no_seats=seats;
		no_doors=doors;
		price=p;
	}
	void speed()
	{
		System.out.println("Speed : 50");
	}
	void printdetails()
	{	System.out.println("Family car details");
		super.printdetails();
		System.out.println("Car doors :"+no_doors);
		System.out.println("Car seats :"+no_seats);
		System.out.println("Car price :"+price);
	}
}
class SportsCar extends Car
{
	int no_seats;
	int no_doors;
	double price;
	SportsCar(String name, String model, String color,int seats,int doors,double p) {
		super(name, model, color);
		no_seats=seats;
		no_doors=doors;
		price=p;
	}
	void speed()
	{
		System.out.println("Speed : 50");
	}
	void printdetails()
	{	System.out.println("Sports car details");
		super.printdetails();
		System.out.println("Car doors :"+no_doors);
		System.out.println("Car seats :"+no_seats);
		System.out.println("Car price :"+price);
	}
}
public class vehicle {

	public static void main(String[] args) 
	{
		FamilyCar f=new FamilyCar("dacia","old","pink",4,7,456456.435);
		SportsCar s=new SportsCar("merc","new","red",2,2,45644356.435);
		f.printdetails();
		s.printdetails();
	}

}
