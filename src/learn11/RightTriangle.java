package learn11;
/**
 * 做一个直角三角形
 * @author 孙裴樱
 *2019-5-22
 */
public class RightTriangle{
	public void printRightTable(int num) {
		for( int i=1;i<=num;i++){
			for(int j=1;j<=i;j++) {
				 System.out.print("*");
				}System.out.println(" ");
			}
	}
	public static void  main (String[] args) {
	}
}