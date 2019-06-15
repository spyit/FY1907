package learn16;
/**
 * 图书馆
 * @author 孙裴樱
 *2019-5-23
 */
public class Book {
	private String name;
	private String author;
	private double price;
	private String publisher;
	//构造方法无参
	public Book(){

	}
	//构造函数有参数
	public Book (String name,String author,double price,String publisher) {
		this.author = author;
		this.name = name;
		this.price = price;
		this.publisher = publisher;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}	
}
