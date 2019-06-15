package learn13;
/**
 * 定义几个类 设计他们需要的属性类型及访问权限   定义这几个属性的读写方法 
 * @author neustu
 *2019-5-22
 */
public class Computer {
		
		private String id;
		private double  cpu;
		private int  RAM;
		private String  viewcard;
		//构造函数
		public Computer(){    //构造函数不带参 10		
			}
			public Computer(String id,double cpu) {
				this.id = id;
				this.cpu = cpu;
			}
			public String getId() {
				return this.id;
			}
			 public void setId(String idd) {
				 this.id = idd;
			}
			 public Computer(int  ram ,String viewcard ) {
				 this.RAM = ram;
				 this.viewcard = viewcard; 
			 }
			 public int getiddd() {
					return this.RAM;
				}
			 public String getidddd() {
					return this.viewcard;
				}			 
}

