package learn15;
/**
 * �ö������������Ե��������ÿ���ϰ
 * @author ����ӣ
 *2019-5-23
 */


public class TestCard {

	public static void main(String[] args) {
		 BankCard c1 = new BankCard("6225-8841-6666-4567","�ܴ�","����",12000);
		 BankCard c2 = new BankCard("6225-8841-6666-4123","�ܶ�","����",8000);
		 BankCard c3 = new BankCard("6225-8841-6666-1236","����","����",10000);
		 BankCard c4 = new BankCard("6225-8841-6666-0158","����","��ͨ",15000);
		 
		 System.out.println(c2.getAccount()); 
		 System.out.println(c4.getAccount());
		 
		 c4.setAccount(c4.getAccount()+8000);
		 System.out.println(c4.getAccount());
	}

}
