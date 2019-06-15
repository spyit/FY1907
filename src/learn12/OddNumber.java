package learn12;
/**
 * 定义一组方法，将传入的int型的数组中的奇数找出来，存入一个新的数组内，并以倒序排列
 * @author 孙裴樱
 *2019-5-22
 */
public class OddNumber {
//		int[] numbs = {7,10,2,32,15,1458,12,99,65,32,11};
		   public int[] getOddArray int[] arrays ){
			int cp=0;
			for(int i=0;i<arrays.length;i++) {
				int p = arrays[i];
				if(p % 2!=0) {
					cp++;
				}
			}
			int[] myNm = new int[cp];//创建了符合实际需要数量的数组
			int m = 0;
			for(int i = 0;i<arrays.length;i++) {
				int p = arrays[i];
				if(p % 2!=0) {
					myNm[m] = p;
					m++;
				}
			}
			for(int t = 0;t<myNm.length;t++) {
				for(int s =t+1;s<myNm.length;s++) {
					if(myNm[t]<myNm[s]) {
						int temp = 0;
						temp = myNm[t];
						myNm[t] = myNm[s];
						myNm[s] = temp;
					}
				}
				}
			} public static void main(String[] args) {
				
			}
		
}		  
