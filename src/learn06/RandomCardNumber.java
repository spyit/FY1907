package learn06;
/**
 * 生成随机卡号
 * @author  孙裴樱
 * 2019-5-20
 *
 */
public class RandomCardNumber {

public static void main(String[] args) {
	/*double d1 = Math.random();//random是一个随机的数  他是一个double类型的
	 System.out.println(d1);//打印输出d1
	 int a = (int)d1;//强制把d1的类型转换成整形
	 System.out.println(a);*/
	//输出打印a	
	 //第一部分输出结果是：
	 //0.523949608716881
	 //	 0
	  String[] strs = new String[30];//定义一个字符串数组
		for(int i=0;i<30;i++) {
			 int a2 = (int)(Math.random()*10000);//强制转换成整形的数据需要乘以一万
			 String s = String.valueOf(a2); //定义一个 字符串   他的值为a2
			 if(s.length()==3) {
				 s = "0"+s;
			 }
			 else if(s.length()==2) {
				 s = "00"+s;
			 }
			 else if(s.length()==1) {
				 s = "000"+s;
			 }
			 //将每次生成的卡号放置到数组当中去
			 strs[i] = "6228-8841-1781-"+s;
			 System.out.println("第"+i+"6228-8841-1871-"+s); 
			 System.out.println("第"+(i+1)+"次:"+s);//全部都是4位数  没有输出三位数  或者别的情况
		}
			 String  st =strs[8];
			 System.out.println(st);
	}
}