package learn17;

public class Circle extends  Shape{
	//圆形得有自己的东西  这时候可以定义成私有的
	private double rad;
	private double red;
//常亮怎么定义     一般声明称public   静态 static   final类型    只要是声明了常量   就会斜体加粗  大写
	public static final double PI  = 3.1415926;
private static final String  = null;
	//如果没有final   这个3.14可以改的   static公共的  final终结者  用final  修饰的方法不可以被重写  不可以被继承  不能有子类（复仇者联盟里面的灭霸）
	//
	public Circle() {
		
	}
	public Circle(String color) {
		//通过构造函数调用父类的color
		super(color);
		//super（）  表示调用了父类的构造
		//子类实例化的原理   你调用子类的  先调用子类的父类的构造方法    子类实例化的时候  默认会找不带参数的实例方法  虚拟机会自动生成
		
	}
	public double getArea() {
		this.area = PI * red*red;
		return area;
	} 
	public void showAll{
		System.out.println("area is :"+this.area);
		System.out.println("per is :"+this.);
		System.out.println("color is :"+this.color);
		System.out.println("rad is :"+this.rad);
	}
}
