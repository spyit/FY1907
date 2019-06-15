package learn05;
/**
 * 做一个矩形   和一个回字
 * @author 孙裴樱
 *data：2019-5-20
 */
public class Rectangle {
	public static void main(String[] args) {
		for( int i=0;i<=20;i++) {
			for( int j=0;j<=20;j++) {
						if(i==0||i==20||j==0||j==20){
							System.out.print("+");		
						}else
						{
							System.out.print(" ");
						}
			}
						System.out.println();
			for( int j=7;j<=13;j++) {
				for(int k=7;k<=13;k++) {
					if(j==7||j==13||k==7||k<=13) {
						System.out.println("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
		}
	}
}
