package q2;

public class EmplyeeVo {
	//instance variables w
	private int empid;
	private String empname;
	private double annualincome;
	private double incometax;

	//get Employee ID
	public int getEmpid() {
	return empid;
	}
	
	//set Employee ID
	public void setEmpid(int empid) {
	this.empid = empid;
	}
	
	//get Employee name
	public String getEmpname() {
	return empname;
	}
	
	//set Employee name
	public void setEmpname(String empname) {
	this.empname = empname;
	}
	
	//get Annual income
	public double getAnnualincome() {
	return annualincome;
	}
	
	//set Annual income
	public void setAnnualincome(double annualincome) {
	this.annualincome = annualincome;
	}
	
	//get income tax
	public double getIncometax() {
	return incometax;
	}
	
	//set income tax
	public void setIncometax(double incometax) {
	this.incometax = incometax;
	}
	
	@Override

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(annualincome);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + empid;
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		temp = Double.doubleToLongBits(incometax);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override

	public boolean equals(Object obj) {
	
		if (this == obj)
			return true;
	
		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;
	
		EmplyeeVo other = (EmplyeeVo) obj;
	
		if (Double.doubleToLongBits(annualincome) != Double.doubleToLongBits(other.annualincome))
			return false;
	
		if (empid != other.empid)
			return false;
		
		if (empname == null) {
			if (other.empname != null)
				return false;
	
		} else if (!empname.equals(other.empname))
			return false;
	
		if (Double.doubleToLongBits(incometax) != Double.doubleToLongBits(other.incometax))
			return false;
		return true;
	}
	
	
	public EmplyeeVo(int empid, String empname, double annualincome, double incometax) {
	
		super();
		this.empid = empid;
		this.empname = empname;
		this.annualincome = annualincome;
		this.incometax = incometax;
	}
}