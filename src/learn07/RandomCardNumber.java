package learn07;
	/**
	 * 
	 * 生成随机指定数量的卡号   并放入字符串数组当中
	 * 将指定卡号数组中，挑选出指定尾号的卡号作为幸运卡号，放入数组中以备程序利用
	 * @author 孙裴樱
	 * data：2019-5-21
	 *
	 */
public class RandomCardNumber{
	public String[] createCardNumbers(int num) {//公共字符串   创建一个卡号叫num
		String[] strs = new String[num];//新建一个对象 strs 字符串num给strs 
		for(int i=0;i<num;i++) {
			int a2 = (int)(Math.random()*10000);//把a2强制类型成整型
			String s = String.valueOf(a2);
			if(s.length()==3) {
				s = "0"+s;
			}else if(s.length()==2) {
				s = "00"+s;
			}else if(s.length()==1) {  //0.000004567
				s = "000"+s;
			}
			//将每次循环生成的合格的卡号存入数组当中去
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
				strss[p-1] = card;   //这里会出现下标越界的异常情况。思考，怎么处理比较合理！
				System.out.println(card);
			}
//			System.out.println(i+"----"+card);
		}
	}
}
