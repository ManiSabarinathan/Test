
public class Employee {
	int empid;
	String empName;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Employee(int empid, String empName) {
		super();
		this.empid = empid;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + empid;
		System.out.println("result Hashcode :: " + result);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Verifying equals ");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empid != other.empid)
			return false;
		return true;
	}
	
	
	
}
