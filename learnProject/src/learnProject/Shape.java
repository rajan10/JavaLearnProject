package learnProject;

abstract class Shape {
	
	abstract double calculateArea(); //abstract method
	
	void display() {  //concrete method
	System.out.println("This is a shape");				
	}
}
	
class Rectangle extends Shape{
	double length;
	double width;
	Rectangle(double length, double width){
		this.length=length;
		this.width=width;
	}
	@Override
	double calculateArea() {  //overide abstract method
		// TODO Auto-generated method stub
		return length*width;
	}

}
public class Shape {
	public static void main(String[] args) {
		
		Rectangle rect= new Rectangle(2,3);
		System.out.println("Area of Rectangle" +rect.calculateArea());
		//Shape shape= new Rectangle(2,3);
		//System.out.println(shape.calculateArea());
}
  
  }

