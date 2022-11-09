package example;

import java.util.*;

public class Client {

	public static void main(String[] args) {
		
		HeadDepartment headDept =  new HeadDepartment(1000000, "Head Dept", new ArrayList<Department>());
		FinanceDepartment financeDept = new FinanceDepartment(150000, "Finance Dept");
		HRDepartment hrDept = new HRDepartment(20000, "HR Dept");
		EngineeringDepartment engDept = new EngineeringDepartment(7000, "Engineering Dept", new ArrayList<Department>());
		EngDesignDepartment engDesDept = new EngDesignDepartment(150000, "Engineering Design Dept");
		ProductionDepartment prodDept = new ProductionDepartment(300000, "Engineering Design Dept");
	
		engDept.getChildrenDepartments().add(engDesDept);
		engDept.getChildrenDepartments().add(prodDept);
		
		headDept.getChildrenDepartments().add(financeDept);
		headDept.getChildrenDepartments().add(hrDept);
		headDept.getChildrenDepartments().add(engDept);
		
		headDept.hasBudget();

	}

}
