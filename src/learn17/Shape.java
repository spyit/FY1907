package learn17;

public class Shape {
	protected double area;
	protected double perimeter;
	protected String color;
	 
	public Shape() {
		
	}
	public Shape(double area,double perimeter,String color){
		this.area = area;
		this.perimeter = perimeter;
		this.color = color;
	}
	public Shape(String color) {
		
	}
	public double getArea(){
		return area;	
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}

