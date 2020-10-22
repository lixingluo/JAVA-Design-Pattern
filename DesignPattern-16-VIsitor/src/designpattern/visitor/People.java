package designpattern.visitor;

public abstract class People {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param name
	 */
	public People(String name) {
		super();
		this.name = name;
	}

	public abstract void accept(AwardChecker checker);
}
