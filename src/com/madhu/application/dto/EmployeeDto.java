package com.madhu.application.dto;

public class EmployeeDto {

	private int employeeId;

	private String employeeName;

	private String gender;

	private boolean pf;

	private boolean graduity;

	private boolean mealcard;

	private boolean nps;

	private boolean mediclaim;

	private String officeLocation;

	private String address;

	private int salary;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isPf() {
		return pf;
	}

	public void setPf(boolean pf) {
		this.pf = pf;
	}

	public boolean isGraduity() {
		return graduity;
	}

	public void setGraduity(boolean graduity) {
		this.graduity = graduity;
	}

	public boolean isMealcard() {
		return mealcard;
	}

	public void setMealcard(boolean mealcard) {
		this.mealcard = mealcard;
	}

	public boolean isNps() {
		return nps;
	}

	public void setNps(boolean nps) {
		this.nps = nps;
	}

	public boolean isMediclaim() {
		return mediclaim;
	}

	public void setMediclaim(boolean mediclaim) {
		this.mediclaim = mediclaim;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public boolean equals(EmployeeDto employeeDto) {
		if(this.employeeId==employeeDto.getEmployeeId())
			return true;
		return false;
	}
	
	public int hashCode() {
		return this.employeeId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeDto [employeeId=");
		builder.append(employeeId);
		builder.append(", employeeName=");
		builder.append(employeeName);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", pf=");
		builder.append(pf);
		builder.append(", graduity=");
		builder.append(graduity);
		builder.append(", mealcard=");
		builder.append(mealcard);
		builder.append(", nps=");
		builder.append(nps);
		builder.append(", mediclaim=");
		builder.append(mediclaim);
		builder.append(", officeLocation=");
		builder.append(officeLocation);
		builder.append(", address=");
		builder.append(address);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
	

	
	

	
}
