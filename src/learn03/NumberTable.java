package learn03;
/**
 * �žų˷���
 * @author ����ӣ
 *2019-5-20
 */

public class NumberTable {

	public void printNumberTable(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				int result = i*j;
				System.out.print(i+"*"+j+"="+result+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		NumberTable t = new NumberTable();
		t.printNumberTable(8);
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				int result = i*j;
				System.out.print(i+"*"+j+"="+result+"\t");
			}
			System.out.println();
		}
//		for(int i=1;i<=5;i++) {
//			System.out.println("���ѭ���ڣ�"+i+" �Ρ�");
//			for(int j=1;j<=i;j++) {
//				System.out.print("�ڲ�ѭ���ڣ�"+j+" �Ρ�");
//			}
//			System.out.println();
//		}
//	}
	}
}
	


