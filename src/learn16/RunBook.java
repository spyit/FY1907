package learn16;
import java.util.Scanner;
/**
 * ����ͼ��   ����۸�   ���������ļ۸�����Щ��
 * @author ����ӣ
 *2019-5-23
 */
public class RunBook {
	private int percent;
	//������������
	public String[] getBookNameByAuther(Book[] books,String auther) {
		String book_names = "";
		String book_info = "";
		for(int i=0;i<books.length;i++) {
			Book b = books[i];
			String author_name = b.getAuthor();//String a =���ܶ���String b =���ܴ�
			if(author_name.equals(auther)) {//�ȶԵ���a  he b���ַ�����
				String b_name = b.getName();
				double price = b.getPrice();
				//�޸��˸ñ��������ļ۸�
				b.setPrice(price*(1+ percent ));
				//��Ҫ���µļ۸������������
				book_info = "������"+b_name+":�Ǽۺ�ļ۸�"+b.getPrice();
				book_names = book_names+b_name+"\\.";//ת���   ��Java��   ��Ҫ�����   "."
			}
		}
		String[] author_book_names = book_names.split("\\.");
		return author_book_names;
	}
	public String[] getBookNameByPrice(Book[] books ,double price1,double price2) {
		int n = 0;
		String names = "";
		for(int i=0;i<books.length;i++) {
			Book book = books[i];
			  double price = book.getPrice();
			  if(price1<=price2) {
				  if(price>price1 && price<=price2) {
					  String name = book.getName();
					  //��Ҫ֪���м���   ��һ����ʱ��
					  n=n+1;
					  	//	  System.out.println(name);
					  names =names+name+",";
					  //  ���͵�15��  �͵�6�� ÿһ�����µ����ֵ�ʱ��   
				    }
			  }else {
				  double temp = 0.0;
				  price1 = temp;
				  price1 = price2;
				  price2 = temp;
			
				  //��������С�ʹ�ıȶ�
				  if(price>price1 && price<=price2) {
					  String name = book.getName();
					  //��Ҫ֪���м���   ��һ����ʱ��
					  n=n+1;
					  // System.out.println(name);
					  names =names+name+",";
					  //  ���͵�15��  �͵�6�� ÿһ�����µ����ֵ�ʱ��   
				    }
			  }
		}
		String[] n_name = names.split(",");//�ָ��ַ���
		return n_name;
		}
	public static void main(String[] args) {
	Book b1 = new Book("����Ա����ô���ɵ�","��ͷǿ",45.75,"�ܳ�û����������");
	Book b2 = new Book("���������İԵ��о�","������",25.88,"�»�������");
	Book b3 = new Book("TCP/IPһ","�⺲��",88.66,"����Ͱͳ�����");
	Book b4 = new Book("TCP/IP��","�⺲��",90.22,"����Ͱͳ�����");
	Book b5 = new Book("TCP/IP��","�⺲��",45.00,"����Ͱͳ�����");
	Book b6 = new Book("�����±����","ȫ���Ϲ�",52.10,"��������");

	//����һ��BOOK���͵�����  ����ŵĶ���Book���͵Ķ���
	//�����ɵ�6��Book���͵Ķ���   һ�δ���Book���͵�������ȥ
	Book[] books = new Book[6];
	books[0] = b1;
	books[1] = b2;
	books[2] = b3;
	books[3] = b4;
	books[4] = b5;
	books[5] = b6;
		
	RunBook rb = new RunBook();
	Scanner scan = new Scanner(System.in);
	System.out.println("����������������");
	String author_name = scan.next();
	System.out.println("�������Ƿ�������");
	double percent = scan.nextDouble();
	String[] authBookNames = rb.getBookNameByAuther(books, "�⺲��");
	for(int i=0;i<authBookNames.length;i++) {
		System.out.println(authBookNames[i]);
	}
	String[] bookNames = rb.getBookNameByPrice(books, 40, 70);
	for(int i=0;i<bookNames.length;i++) {
		System.out.println(bookNames[i]);
	}	
	//���۸���25--45֮��������г�����
//	//������ȡ����
//	int n = 0;
//	for(int i=0;i<books.length;i++) {
//		Book book = books[i];
//		  double price = book.getPrice();
//		  if(price>25 && price<=45) {
//			  String name = book.getName();
//			  //��Ҫ֪���м���   ��һ����ʱ��
//			  n=n+1;
//			  System.out.println(name);
//		    }
//		}System.out.println("�۸���25--45֮�����һ���У�"+n+"��");
	}
}