package learn04;
/**
 * �ַ�����ϰ  ƴ���ַ���
 * @author ����ӣ
 * 2019-5-20
 *
 */

public class StringLearning {
	public static void main(String[] args) {
		String s1 = "neusoft-Dalian-0520!";
		String s2 = "liao Ning";
	//  String s3 = s1+s2;
		//concat()ƴ�������ַ�������
		String s3 = s1.concat(s2);
		//length()��ȡ�ַ���������ַ��ĳ���
		int a = s3.length();
		System.out.println(s3+"������:"+a);
		System.out.println("-------------1----------");
		//split��������ָ���ַ�������ַ���Ϊһ������
		String[] strs = s1.split("-");
		int size = strs.length;
		String s4 = strs[1];
		System.out.println(s4+"��������ǣ�"+size);
		for(int i=0;i<size;i++) {
		System.out.println(strs[i]);
		}
		System.out.println("-----------2------------");
		//replace()�滻ָ���ַ�Ϊ�µ��ַ�
		String s5 = s1.replace('!','?');
		System.out.println(s5);
		String s6 = s5.replace('-', '+');
		System.out.println(s6);
		//starWith()�ж��ַ������Ƿ���ָ���ַ�����ͷ
		boolean b1 = s6.startsWith("n");
		System.out.println(b1);
	}
}
