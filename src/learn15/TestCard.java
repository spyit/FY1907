package learn15;
/**
 * 用对象来操作属性的银行信用卡练习
 * @author 孙裴樱
 *2019-5-23
 */


public class TestCard {

	public static void main(String[] args) {
		 BankCard c1 = new BankCard("6225-8841-6666-4567","熊大","工商",12000);
		 BankCard c2 = new BankCard("6225-8841-6666-4123","熊二","建行",8000);
		 BankCard c3 = new BankCard("6225-8841-6666-1236","熊三","招商",10000);
		 BankCard c4 = new BankCard("6225-8841-6666-0158","熊四","交通",15000);
		 
		 System.out.println(c2.getAccount()); 
		 System.out.println(c4.getAccount());
		 
		 c4.setAccount(c4.getAccount()+8000);
		 System.out.println(c4.getAccount());
	}

}
