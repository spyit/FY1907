package learn14;
/**
 * ���������������   ��ʾû�л���


 * 2019-5-22
 */
import java.util.Scanner;
public class Login {
	private Scanner scan;
	public void LoginPassword() {
		scan = new Scanner(System.in);
		for(int i=1;i<=3;i++) {
		System.out.println("����������");
		int password = scan.nextInt();
			if(password==123456) {
				System.out.println("������ȷ");				
				continue;
			}else if(i==3) 
				{
				System.out.println("������˼  û�л����� ");
				}
		}	
	}
	public static void main(String[] args) {
		Login lg = new Login();
		lg.LoginPassword();
	}
}
