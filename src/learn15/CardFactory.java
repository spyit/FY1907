package learn15;
/**
 * �ö������������Ե��������ÿ���ϰ
 * @author ����ӣ
 *2019-5-23
 */


public class CardFactory {
	
	//����Ҫ����30��������   һ�ſ�Ӧ�÷��ڿ���������BankCard������  ����һ��������
	//������������κζ�������   ֻҪ������
	//
	public BankCard[] creactCardObj( String preNum ,int count) {
		//Ӧ��װ���ٵĿ�  ���ڴ�������
		BankCard[] cards = new BankCard[count];
		//����count��     �Ǿ�ѭ��count��
		for(int i=0;i<count;i++) {
			  int p = (int)(Math.random()*10000);
			  //����һ�Ѳ˵� ��������
			  String randomNum = String.valueOf(p);
			  if(randomNum.length()==3) {
				  randomNum = "0"+randomNum;
			  }else if(randomNum.length()==2) {
				  randomNum = "00"+randomNum; 
			  }
			  else if(randomNum.length()==1) {
				  randomNum = "000"+randomNum; 
			  }
			  //�����ǰ�úŶκ����β��4λ��β��ƴ�ӣ�����һ�������Ŀ���
			  //��ʱ����õ���ǰ��д�Ĳ����εĹ��캯��  Ҳ�й��췽��
			  String cardId = preNum+randomNum;
			  BankCard card = new BankCard();
			  card.setId(cardId);
			  card.setAccount(10000);
			  card.setBank_name("��ͨ����");
			  card.setUser_name("�ܳ�û"+i);
			  //ѭ��һ��   newһ��
			  //ûѭ��һ��   ���ǲ��û���card �ͱ�������  ���Ա�������һ������  ����cards�Ҳ���Ǽ����Ŀ������С��count 
			  //����һ��Ҫ����cards��i�� = card;��仰����Ҫ
			  cards[i] = card;
			  //һ������  Ӧ��set��һ��������������ȥ
		}
			return cards;
	}
	    	  //��Ҫ�������һ��������   ֻҪ��β��6   ֻ�ѿ����ó���  û����
			  //��������������ﶪ   �����ж��    �Ϳ��м������˿���   ͨ�����ҵ�������  �������кö������  �ҵ�����Ķ���  �����˿����󶪵�������
		      //ͨ������β�ŵ����룬����������������п����󣬽����˶�������Ŷ������5000  
	public BankCard[] getLuckCards( BankCard[] cardObj ,String LuckyNum) {
//			BankCard[] luckyCards = new BankCard[0];
			//ͨ������ѿ����ó���   ��get����ID�����ҵ�
		int count = 0;
			for(int i = 0;i<cardObj.length;i++) {
				BankCard card = cardObj[i];
				String id = card.getId();
				//47���ǰѿ����������ID�ó���
				if(id.endsWith(LuckyNum)) {
					count++;
				}
			}
			BankCard[] luckyCards = new BankCard[count];
			//�����˿��Ŷ�Ӧ�Ŀ���������Ŷ�Ƚ��ж������5000�������ÿ�������������ڣ�luckyCards
			//�Կ�������в���
			int k = 0;
			for(int i = 0;i<cardObj.length;i++) {
				BankCard card = cardObj[i];
				String id = card.getId();
				if(id.endsWith(LuckyNum)) {
					int newAccount = card.getAccount()+5000;
					card.setAccount(newAccount);
					//�����˿��Ŵ������˿��ŵ���������ȥ   ����luckyCards  ��Ҫ�������� 
					luckyCards[k] = card;
					k++;
					//��ʱ��ѭ������    ��������װ��ȥ�ľ�������Ҫ�����˺ŵĿ�����
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