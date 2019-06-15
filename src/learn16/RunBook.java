package learn16;
import java.util.Scanner;
/**
 * 测试图书   输入价格   在这个区间的价格有哪些书
 * @author 孙裴樱
 *2019-5-23
 */
public class RunBook {
	private int percent;
	//根据作者找书
	public String[] getBookNameByAuther(Book[] books,String auther) {
		String book_names = "";
		String book_info = "";
		for(int i=0;i<books.length;i++) {
			Book b = books[i];
			String author_name = b.getAuthor();//String a =“熊二”String b =“熊大”
			if(author_name.equals(auther)) {//比对的是a  he b的字符串量
				String b_name = b.getName();
				double price = b.getPrice();
				//修改了该本竖脊肌的价格
				b.setPrice(price*(1+ percent ));
				//我要把新的价格和书名串起来
				book_info = "书名："+b_name+":涨价后的价格"+b.getPrice();
				book_names = book_names+b_name+"\\.";//转意符   在Java中   不要随便用   "."
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
					  //想要知道有几本   做一个定时器
					  n=n+1;
					  	//	  System.out.println(name);
					  names =names+name+",";
					  //  解释第15行  和第6行 每一次有新的名字的时候，   
				    }
			  }else {
				  double temp = 0.0;
				  price1 = temp;
				  price1 = price2;
				  price2 = temp;
			
				  //这个情况是小和大的比对
				  if(price>price1 && price<=price2) {
					  String name = book.getName();
					  //想要知道有几本   做一个定时器
					  n=n+1;
					  // System.out.println(name);
					  names =names+name+",";
					  //  解释第15行  和第6行 每一次有新的名字的时候，   
				    }
			  }
		}
		String[] n_name = names.split(",");//分割字符串
		return n_name;
		}
	public static void main(String[] args) {
	Book b1 = new Book("程序员是怎么练成的","光头强",45.75,"熊出没北京出版社");
	Book b2 = new Book("不削美国的霸道行径","任正非",25.88,"新华出版社");
	Book b3 = new Book("TCP/IP一","吴翰清",88.66,"阿里巴巴出版社");
	Book b4 = new Book("TCP/IP二","吴翰清",90.22,"阿里巴巴出版社");
	Book b5 = new Book("TCP/IP三","吴翰清",45.00,"阿里巴巴出版社");
	Book b6 = new Book("程序媛变身记","全民老公",52.10,"万达出版社");

	//创建一个BOOK类型的数组  里面放的都是Book类型的对象
	//将生成的6个Book类型的对象   一次存入Book类型的数组中去
	Book[] books = new Book[6];
	books[0] = b1;
	books[1] = b2;
	books[2] = b3;
	books[3] = b4;
	books[4] = b5;
	books[5] = b6;
		
	RunBook rb = new RunBook();
	Scanner scan = new Scanner(System.in);
	System.out.println("请输入作者姓名：");
	String author_name = scan.next();
	System.out.println("请输入涨幅比例：");
	double percent = scan.nextDouble();
	String[] authBookNames = rb.getBookNameByAuther(books, "吴翰清");
	for(int i=0;i<authBookNames.length;i++) {
		System.out.println(authBookNames[i]);
	}
	String[] bookNames = rb.getBookNameByPrice(books, 40, 70);
	for(int i=0;i<bookNames.length;i++) {
		System.out.println(bookNames[i]);
	}	
	//将价格在25--45之间的书名列出来；
//	//在依次取出来
//	int n = 0;
//	for(int i=0;i<books.length;i++) {
//		Book book = books[i];
//		  double price = book.getPrice();
//		  if(price>25 && price<=45) {
//			  String name = book.getName();
//			  //想要知道有几本   做一个定时器
//			  n=n+1;
//			  System.out.println(name);
//		    }
//		}System.out.println("价格在25--45之间的数一共有："+n+"本");
	}
}