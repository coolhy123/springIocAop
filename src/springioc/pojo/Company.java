package springioc.pojo;
/**
* @author ����
* @createDate ����ʱ�䣺2019��8��22�� ����9:08:54
*/
public class Company {
	private String name;
	private String address;
	private char type;
	
	public Company() {
		System.out.println("����company�Ĺ��췽��");
	}
	
	public Company(String name,String address,char type) {
		this.name = name;
		this.address = address;
		this.type = type;
		System.out.println("����company�Ĵ��ι��췽��");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", address=" + address + ", type=" + type + "]";
	}
	
	
	
}
