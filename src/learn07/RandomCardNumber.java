package learn07;
	/**
	 * 
	 * �������ָ�������Ŀ���   �������ַ������鵱��
	 * ��ָ�����������У���ѡ��ָ��β�ŵĿ�����Ϊ���˿��ţ������������Ա���������
	 * @author ����ӣ
	 * data��2019-5-21
	 *
	 */
public class RandomCardNumber{
	public String[] createCardNumbers(int num) {//�����ַ���   ����һ�����Ž�num
		String[] strs = new String[num];//�½�һ������ strs �ַ���num��strs 
		for(int i=0;i<num;i++) {
			int a2 = (int)(Math.random()*10000);//��a2ǿ�����ͳ�����
			String s = String.valueOf(a2);
			if(s.length()==3) {
				s = "0"+s;
			}else if(s.length()==2) {
				s = "00"+s;
			}else if(s.length()==1) {  //0.000004567
				s = "000"+s;
			}
			//��ÿ��ѭ�����ɵĺϸ�Ŀ��Ŵ������鵱��ȥ
			strs[i] = "6225-8841-1781-"+s;
		}
		return strs;
	}
	public static void main(String[] args) {
		RandomCardNumber test = new RandomCardNumber();
		String[] cards = test.createCardNumbers(25);
		int p = 0;
		for(int i=0;i<cards.length;i++) {
			String card = cards[i];
			boolean b = card.endsWith("8");  // true false
			if(b) {
				p++;
				System.out.println(card);
			}
//			System.out.println(i+"----"+card);
		}
		System.out.println("p :"+p);
		String[] strss = new String[p];
		for(int i=0;i<cards.length;i++) {
			String card = cards[i];
			boolean b = card.endsWith("8");  // true false
			if(b) {
				strss[p-1] = card;   //���������±�Խ����쳣�����˼������ô����ȽϺ���
				System.out.println(card);
			}
//			System.out.println(i+"----"+card);
		}
	}
}
