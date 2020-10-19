package designpattern.prototype;

public class Master implements Prototype {
	private int num;
	private String name;
	private int status;
	
	public void copy(Master master) {
		this.num = master.getNum();
		this.name = master.getName();
		this.status = master.getStatus();
	}
	
	public Master clone() {
		Master master = new Master();
		master.num = this.num;
		master.name = this.name;
		master.status = this.status;
		return master;
	}
	
	public void display() {
		System.out.println("----------"+"第"+num+"周学习总结"+"--------------");
		System.out.println("姓名："+name);
		System.out.println("状态："+showStatus());
		System.out.println();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public String showStatus() {
		return this.status == 0 ? "优秀" : "垃圾";
	}
}
