package learn08;
/**
 * ơ��С��Ϸ   ����ƿơ�ƻ�õ�һƿ     ����50ƿ��  ������ȶ���ơ�ƣ�
 * @author ����ӣ
 *data��2019-5-21
 *
 */
public class Beer {
	public int drinkBeer(int numbs,int k) {
		int p= numbs;
		for(int i=1;i<=p;i++) 
		{
			if(i % 3==0)
			{
				p++;
			}
		}return p ;
	}

	public static void main(String[] args) {
//		int p = 50;
//		for(int i=1;i<=p;i++) {
//			if(i % 3==0) {
//				p++;
//			}
//		}
//		System.out.println(p);
		Beer b = new Beer();
		int count = b.drinkBeer(50,3 );
		System.out.println(count);
	}
}
