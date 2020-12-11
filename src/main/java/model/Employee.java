package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
	@Column(name="Fname")
	private String fname;
	
	@Column(name="Mname")
	private char mname;
	
	@Column(name="Lname")
	private String lname;
	
	@Id
	@Column(name="Ssn")
	private int ssn;
	
	@Column(name="Bdate")
	@Temporal(TemporalType.DATE)
	private Date bdate;
	
	@Column(name="Address", updatable = true)
	private String address;
	
	@Column(name="Sex")
	private char sex;
	
	@Column(name="Salary", updatable = true)
	private int salary;
	
	@Column(name="superV_ssn", updatable = true)
	private int superSsn;
	
	@ManyToOne
	@JoinColumn(name="Dnumber", updatable = true)
	private Department dep;
	
	
	
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public char getMname() {
		return mname;
	}
	public void setMname(char mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSuperSsn() {
		return superSsn;
	}
	public void setSuperSsn(int superSsn) {
		this.superSsn = superSsn;
	}
	
	
	
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", ssn=" + ssn + ", bdate="
				+ bdate + ", address=" + address + ", sex=" + sex + ", salary=" + salary + ", superSsn=" + superSsn
				+ ", dep=" + dep + "]";
	}
	
	
}
