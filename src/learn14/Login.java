package learn14;
/**
 * 输入三次密码错误   显示没有机会


 * 2019-5-22
 */
import java.util.Scanner;
public class Login {
	private Scanner scan;
	public void LoginPassword() {
		scan = new Scanner(System.in);
		for(int i=1;i<=3;i++) {
		System.out.println("请输入密码");
		int password = scan.nextInt();
			if(password==123456) {
				System.out.println("密码正确");				
				continue;
			}else if(i==3) 
				{
				System.out.println("不好意思  没有机会了 ");
				}
		}	
	}
	public static void main(String[] args) {
		Login lg = new Login();
		lg.LoginPassword();
	}
}
