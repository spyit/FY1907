package learn06;
/**
 * �����������
 * @author  ����ӣ
 * 2019-5-20
 *
 */
public class RandomCardNumber {

public static void main(String[] args) {
	/*double d1 = Math.random();//random��һ���������  ����һ��double���͵�
	 System.out.println(d1);//��ӡ���d1
	 int a = (int)d1;//ǿ�ư�d1������ת��������
	 System.out.println(a);*/
	//�����ӡa	
	 //��һ�����������ǣ�
	 //0.523949608716881
	 //	 0
	  String[] strs = new String[30];//����һ���ַ�������
		for(int i=0;i<30;i++) {
			 int a2 = (int)(Math.random()*10000);//ǿ��ת�������ε�������Ҫ����һ��
			 String s = String.valueOf(a2); //����һ�� �ַ���   ����ֵΪa2
			 if(s.length()==3) {
				 s = "0"+s;
			 }
			 else if(s.length()==2) {
				 s = "00"+s;
			 }
			 else if(s.length()==1) {
				 s = "000"+s;
			 }
			 //��ÿ�����ɵĿ��ŷ��õ����鵱��ȥ
			 strs[i] = "6228-8841-1781-"+s;
			 System.out.println("��"+i+"6228-8841-1871-"+s); 
			 System.out.println("��"+(i+1)+"��:"+s);//ȫ������4λ��  û�������λ��  ���߱�����
		}
			 String  st =strs[8];
			 System.out.println(st);
	}
}