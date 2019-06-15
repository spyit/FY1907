package learn19;
import java.util.Scanner;
public class CashMachine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入单价（¥）：");
		//获得到的键盘输入流中的double型的值，作为 单价
		double price = scanner.nextDouble();
		System.out.println("请输入数量");
		//获得到的键盘输入流中的double型的值，作为 数量
		double count  = scanner.nextDouble();
		double amount = scanner.nextDouble();
		System.out.println("请输入收款金额");
		//实际收到客人交款
		double cash = scanner.nextDouble();
		//计算应收款
		double totalPrice = price *amount;
		//对单次购货总额超过300元的客人给与八折优惠
		if(totalPrice >=300) {
		total Price = totalPrice *0.8;
		}
		//计算应像客人找回多少钱款
		double change = cash-totalPrice;
		System.out.println("实收现金"+cash+"应收现额");
	}	
}