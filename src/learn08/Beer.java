package learn08;
/**
 * 啤酒小游戏   喝三瓶啤酒会得到一瓶     问有50瓶酒  你最多会喝多少啤酒？
 * @author 孙裴樱
 *data：2019-5-21
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
