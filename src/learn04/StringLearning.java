package learn04;
/**
 * 字符串练习  拼接字符串
 * @author 孙裴樱
 * 2019-5-20
 *
 */

public class StringLearning {
	public static void main(String[] args) {
		String s1 = "neusoft-Dalian-0520!";
		String s2 = "liao Ning";
	//  String s3 = s1+s2;
		//concat()拼接俩个字符串对象
		String s3 = s1.concat(s2);
		//length()获取字符串对象的字符的长度
		int a = s3.length();
		System.out.println(s3+"长度是:"+a);
		System.out.println("-------------1----------");
		//split（）根据指定字符，拆分字符串为一个数组
		String[] strs = s1.split("-");
		int size = strs.length;
		String s4 = strs[1];
		System.out.println(s4+"这个区分是："+size);
		for(int i=0;i<size;i++) {
		System.out.println(strs[i]);
		}
		System.out.println("-----------2------------");
		//replace()替换指定字符为新的字符
		String s5 = s1.replace('!','?');
		System.out.println(s5);
		String s6 = s5.replace('-', '+');
		System.out.println(s6);
		//starWith()判断字符串中是否以指定字符串开头
		boolean b1 = s6.startsWith("n");
		System.out.println(b1);
	}
}
