package learn15;
/**
 * �ö������������Ե��������ÿ���ϰ
 * @author ����ӣ
 *2019-5-23
 */

public class BankCard {
	//����˿�Ϊ�������ÿ�
	private String Id;//���п���
	private String user_name;//�û�����
	private String bank_name;//��������
	private int account;//���ö��     ����������
	//���췽��   ������
	public BankCard() {
		
	}
	//���췽��   ����
	public BankCard(String id,String user_name,String bank_name,int account) {
		this.Id = id;
		this.user_name = user_name;
		this.bank_name = bank_name;
		this.account = account;
	}
	//Id���ԵĶ�����
	 public String getId() {
		 return this.Id;
	 }
	 //Id���Ե�д����
	 public void setId(String Id) {
		 this.Id = Id;
	 }
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
}