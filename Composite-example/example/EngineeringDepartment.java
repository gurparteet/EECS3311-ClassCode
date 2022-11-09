package example;

import java.util.*;

public class EngineeringDepartment implements Department {

	public EngineeringDepartment(float budget, String name, List<Department> childrenDepartments) {
		super();
		this.childrenDepartments = childrenDepartments;
		this.budget = budget;
		this.name = name;
	}

	private float budget;
	private String name;
	private List<Department> childrenDepartments;

	@Override
	public float hasBudget() {
		float total = budget;
		System.out.println("The own budget of department " + name + " is " + budget);
		for (Department dept : childrenDepartments) {
			total = total + dept.hasBudget();
		}
		System.out.println("The total budget of department " + name + " is " + total);
		return budget;
	}

	public void setBudget(float budget) {
		this.budget = budget;
	}

	public List<Department> getChildrenDepartments() {
		return childrenDepartments;
	}

	public void setChildrenDepartments(List<Department> childrenDepartments) {
		this.childrenDepartments = childrenDepartments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
