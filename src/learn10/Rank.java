package learn10;
/**
 * 冒泡组合  排序   一组数组  从大到小
 * 核心原理   双重循环法
 * @author 孙裴樱
 *2019-5-21
 */
public class Rank {
	public static void main(String[] args) {
		int[] numbs = {7,3,9,10,95,65,21,0,-8};
			for(int i=0;i<numbs.length;i++){
				for(int j=i+1;j<numbs.length;j++){
					if(numbs[i]<numbs[j])
					{
						int temp = 0;
						temp = numbs[i];
						numbs[i] = numbs[j];
						numbs[j] = temp;
					}
				}
			}
			for(int i = 0;i<numbs.length;i++) {
				System.out.println("No."+i+":"+numbs[i]);
			}	
	}
}