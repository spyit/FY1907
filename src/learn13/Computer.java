package learn13;
/**
 * ���弸���� ���������Ҫ���������ͼ�����Ȩ��   �����⼸�����ԵĶ�д���� 
 * @author neustu
 *2019-5-22
 */
public class Computer {
		
		private String id;
		private double  cpu;
		private int  RAM;
		private String  viewcard;
		//���캯��
		public Computer(){    //���캯�������� 10		
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

