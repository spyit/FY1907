package learn15;
/**
 * 用对象来操作属性的银行信用卡练习
 * @author 孙裴樱
 *2019-5-23
 */

public class BankCard {
	//定义此卡为银行信用卡
	private String Id;//银行卡号
	private String user_name;//用户名字
	private String bank_name;//银行名字
	private int account;//信用额度     都是整数的
	//构造方法   不带参
	public BankCard() {
		
	}
	//构造方法   带参
	public BankCard(String id,String user_name,String bank_name,int account) {
		this.Id = id;
		this.user_name = user_name;
		this.bank_name = bank_name;
		this.account = account;
	}
	//Id属性的读方法
	 public String getId() {
		 return this.Id;
	 }
	 //Id属性的写方法
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