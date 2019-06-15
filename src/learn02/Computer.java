package learn02;
/**
 * ¼ÆËãÆ÷¼Ó¼õ³Ë³ı
 * @author ËïÅáÓ£
 * 2019-5-20
 *
 */
public class Computer {
	/*public static void main(String[] args) {
		 int a = 2500;
		 int b = 750;
		 int c =a+b;
		 System.out.println(c);
		 
		 String s1 = "888888";
		 String s2 = "666666";
		 String s3 = s1+s2;
		 System.out.println(s3);*/
	public int computer(int a, int b,char flag) {
		int result = 0;
		switch(flag) {
		case 's':
			result = a+b;
			break;
		case 'p':
			result = a-b;
			break;
		case 'y':
			result = a*b;
			break;
		case 'h':
			result = a/b;
			break;
	}
	return result;
}
public static void main(String[]args) {
			Computer com = new Computer();
			int s = com.computer(12,13,'s');
			System.out.println(s);
			int p = com.computer(12,13,'p');
			System.out.println(p);
			int y = com.computer(12,10,'y');
			System.out.println(y);
			int h = com.computer(12,12,'h');
			System.out.println(h);
}
}
