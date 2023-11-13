package javaTestFolder;

public class Employee {
	
	 
	String empName;
	String empAddress;
	int empPhone;

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public int getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(int empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAddress=" + empAddress + ", empPhone=" + empPhone + "]";
	}

	 
	
	 
	
	
	
	}
	

