package example;

public class FinanceDepartment implements Department {
	public FinanceDepartment(float budget, String name) {
		super();
		this.budget = budget;
		this.name = name;
	}


	private float budget;
	private String name;

	@Override
	public float hasBudget() {
		System.out.println("The own budget of department " + name + " is " + budget);
		return budget;
	}


	public void setBudget(float budget) {
		this.budget = budget;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


}
