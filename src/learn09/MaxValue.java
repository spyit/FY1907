package learn09;
/**
 * һ��ָ��������������ֵ
 * data:2019-5-21
 * 
 */
public class MaxValue {
	
	public int getMaxValue(int[] numbs) {
		int max_value = Integer.MIN_VALUE;
		for(int i=0;i<numbs.length;i++) {
			int temp = numbs[i];
			if(temp>max_value) {
				max_value = temp;
			}
		}
		return max_value;
	}
	public int getMinValue(int[] numbs) {
		int min_value = Integer.MAX_VALUE;
		for (int i=0;i<numbs.length;i++) {
			int  temp = numbs[i];
			if(temp < min_value) {
				min_value = temp;
			}
		}
		return min_value;
	}
	public static void main(String[] args) {
//		int[] numbs = {7,8,90,-3,97,100}; //����һ��ָ��������
//		int max_Value = Integer.MIN_VALUE;//����integer�����ָ��һ����Сֵ   
//		for(int i=0;i<numbs.length;i++) { //
//			int temp = numbs[i];
//			if(temp>max_Value) {
//				max_Value = temp;
//			}
//		}
//			System.out.println(max_Value);
//	}
		int[] numbs = {7,-3,50,88,90,800};
		MaxValue tools = new MaxValue();
		System.out.println(tools.getMaxValue(numbs));
		System.out.println(tools.getMinValue(numbs));
	}
}