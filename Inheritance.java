//There is something wrong here but its just a test code.
class CarParts extends Car{
	int number;
	int totla;
	String name;
	
	public void CarParts(int number, int total, String name){
		this.number = number;
		this.total = total;
		this.name = name;
	}
	public void CarParts(){
		this.number = -1;
		this.total = -1;
		this.name = null;	
}
	
	public void parts(int totalNumbers,String name){
		super(name);
		System.out.println("the total number of students is :"+ totalNumbers);	
} 
}

class Car{
	public void parts(String name){
		System.out.println("the name of the parts is: "+name);
}


public class Inheritance{
	public static void main(String [] args){
		CarParts obj = new CarParts();
		obj.parts(23,"hundai")
}
}
