package learn15;
/**
 * 用对象来操作属性的银行信用卡练习
 * @author 孙裴樱
 *2019-5-23
 */


public class CardFactory {
	
	//现在要生成30个卡对象   一张卡应该放在卡的类型里BankCard类型中  放在一个数组中
	//在数组里面放任何东西都行   只要有类型
	//
	public BankCard[] creactCardObj( String preNum ,int count) {
		//应该装多少的卡  现在创建容器
		BankCard[] cards = new BankCard[count];
		//生成count个     那就循环count遍
		for(int i=0;i<count;i++) {
			  int p = (int)(Math.random()*10000);
			  //这是一把菜刀 拿来就用
			  String randomNum = String.valueOf(p);
			  if(randomNum.length()==3) {
				  randomNum = "0"+randomNum;
			  }else if(randomNum.length()==2) {
				  randomNum = "00"+randomNum; 
			  }
			  else if(randomNum.length()==1) {
				  randomNum = "000"+randomNum; 
			  }
			  //完成了前置号段和随机尾号4位的尾号拼接，产生一个完整的卡号
			  //这时候调用的是前面写的不带参的构造函数  也叫构造方法
			  String cardId = preNum+randomNum;
			  BankCard card = new BankCard();
			  card.setId(cardId);
			  card.setAccount(10000);
			  card.setBank_name("交通银行");
			  card.setUser_name("熊出没"+i);
			  //循环一遍   new一次
			  //没循环一次   但是不用还是card 就被覆盖了  所以必须生成一个卡号  放在cards里（也就是鸡蛋的框里）并且小于count 
			  //所以一定要加上cards【i】 = card;这句话很重要
			  cards[i] = card;
			  //一个卡号  应该set到一个卡对象属性上去
		}
			return cards;
	}
	    	  //我要定义的是一个卡对象   只要是尾号6   只把卡号拿出来  没有用
			  //这个对象往篮子里丢   篮子有多大    就看有几个幸运卡号   通过卡找到卡对象  卡对象有好多个属性  找到具体的对象  把幸运卡对象丢到数组里
		      //通过幸运尾号的输入，遍历传入进来的所有卡对象，将幸运对象的授信额度提升5000  
	public BankCard[] getLuckCards( BankCard[] cardObj ,String LuckyNum) {
//			BankCard[] luckyCards = new BankCard[0];
			//通过对象把卡号拿出来   在get卡号ID把人找到
		int count = 0;
			for(int i = 0;i<cardObj.length;i++) {
				BankCard card = cardObj[i];
				String id = card.getId();
				//47行是把卡对象里面的ID拿出来
				if(id.endsWith(LuckyNum)) {
					count++;
				}
			}
			BankCard[] luckyCards = new BankCard[count];
			//对幸运卡号对应的卡对象的授信额度进行额度提升5000，并将该卡对象存在数组内：luckyCards
			//对卡对象进行操作
			int k = 0;
			for(int i = 0;i<cardObj.length;i++) {
				BankCard card = cardObj[i];
				String id = card.getId();
				if(id.endsWith(LuckyNum)) {
					int newAccount = card.getAccount()+5000;
					card.setAccount(newAccount);
					//把幸运卡号存在幸运卡号的数组里面去   存在luckyCards  需要做计数器 
					luckyCards[k] = card;
					k++;
					//这时候循环完事    数组里面装进去的就是你想要的幸运号的卡对象
				}
			}
			return luckyCards;
	}
		public static void main(String[] args) {
			CardFactory t = new CardFactory();
			t.creactCardObj("6225-8841-6666-",20);
			
			for(int i=0;i<cards.length;i++) {
				BankCard card = cards[i];
				String b_name = card.getBank_name();
				String u_name = card.getUser_name();
				String id = card.getId();
				int account = card.getAccount();
				System.out.println((i+1)+":"+b_name+"-"+u_name+"-"+id+"-"+account);
			}
			BankCard[]luckCard = t.getLuckCards(cards,"6");
			for(int i=0;i<luckyCards.lenght;i++) {
				BankCard luckCard = luckyCards[i];
				String u_name = luckCard.getUser_name();
				String b_name = luckCard.getBank_name();
				String id = luckCard.getId();
				int account = luckCard.getAccount();
				System.out.println((i+1)+":"+b_name+"-"+u_name+"-"+id+"-"+account);
			}
		}
}