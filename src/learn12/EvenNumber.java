package learn12;
/**
 * 一个整型数组：{12,30,8，-8,76，-250,43,999，-1000}   请将偶数取出来  并存入在一个新的数组中  并以正序排列
 * @author neustu
 *2019-5-22
 */
public class EvenNumber {
	int[] getOddArray int[]arrays(){  
	public static void main(String[] args) {
		int[] numbs = {12,30,8,-8,76,-250,43,999,-1000};
		   
		int cp=0;
		for(int i=0;i<arrays.length;i++) {
			int p = arrays()[i];
			if(p % 2==0) {
				cp++;
			}
		}
		int[] myNm = new int[cp];//创建了符合实际需要数量的数组
		int m = 0;
		for(int i = 0;i<arrays.length;i++) {
			int p = arrays()[i];
			if(p % 2==0) {
				myNm[m] = p;
				m++;
			}
		}
		for(int t = 0;t<myNm.length;t++) {
			for(int s =t+1;s<myNm.length;s++) {
				if(myNm[t]>myNm[s]) {
					int temp = 0;
					temp = myNm[t];
					myNm[t] = myNm[s];
					myNm[s] = temp;
				}
			}
		}
	}	
}
