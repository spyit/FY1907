package learn17;

public class Circle extends  Shape{
	//Բ�ε����Լ��Ķ���  ��ʱ����Զ����˽�е�
	private double rad;
	private double red;
//������ô����     һ��������public   ��̬ static   final����    ֻҪ�������˳���   �ͻ�б��Ӵ�  ��д
	public static final double PI  = 3.1415926;
private static final String  = null;
	//���û��final   ���3.14���Ըĵ�   static������  final�ս���  ��final  ���εķ��������Ա���д  �����Ա��̳�  ���������ࣨ�����������������ԣ�
	//
	public Circle() {
		
	}
	public Circle(String color) {
		//ͨ�����캯�����ø����color
		super(color);
		//super����  ��ʾ�����˸���Ĺ���
		//����ʵ������ԭ��   ����������  �ȵ�������ĸ���Ĺ��췽��    ����ʵ������ʱ��  Ĭ�ϻ��Ҳ���������ʵ������  ��������Զ�����
		
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
