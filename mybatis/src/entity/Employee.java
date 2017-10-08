package entity;

import java.util.Date;

public class Employee {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SCOTT.EMPLOYEE.EMPNO
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	private Long empno;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SCOTT.EMPLOYEE.ENAME
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	private String ename;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SCOTT.EMPLOYEE.JOB
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	private String job;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SCOTT.EMPLOYEE.MGR
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	private Long mgr;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SCOTT.EMPLOYEE.HIREDATE
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	private Date hiredate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SCOTT.EMPLOYEE.SAL
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	private Double sal;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column SCOTT.EMPLOYEE.COMM
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	private Double comm;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SCOTT.EMPLOYEE.EMPNO
	 * @return  the value of SCOTT.EMPLOYEE.EMPNO
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	public Long getEmpno() {
		return empno;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SCOTT.EMPLOYEE.EMPNO
	 * @param empno  the value for SCOTT.EMPLOYEE.EMPNO
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	public void setEmpno(Long empno) {
		this.empno = empno;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SCOTT.EMPLOYEE.ENAME
	 * @return  the value of SCOTT.EMPLOYEE.ENAME
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	public String getEname() {
		return ename;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SCOTT.EMPLOYEE.ENAME
	 * @param ename  the value for SCOTT.EMPLOYEE.ENAME
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SCOTT.EMPLOYEE.JOB
	 * @return  the value of SCOTT.EMPLOYEE.JOB
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	public String getJob() {
		return job;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SCOTT.EMPLOYEE.JOB
	 * @param job  the value for SCOTT.EMPLOYEE.JOB
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SCOTT.EMPLOYEE.MGR
	 * @return  the value of SCOTT.EMPLOYEE.MGR
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	public Long getMgr() {
		return mgr;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SCOTT.EMPLOYEE.MGR
	 * @param mgr  the value for SCOTT.EMPLOYEE.MGR
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	public void setMgr(Long mgr) {
		this.mgr = mgr;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SCOTT.EMPLOYEE.HIREDATE
	 * @return  the value of SCOTT.EMPLOYEE.HIREDATE
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	public Date getHiredate() {
		return hiredate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SCOTT.EMPLOYEE.HIREDATE
	 * @param hiredate  the value for SCOTT.EMPLOYEE.HIREDATE
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SCOTT.EMPLOYEE.SAL
	 * @return  the value of SCOTT.EMPLOYEE.SAL
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	public Double getSal() {
		return sal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SCOTT.EMPLOYEE.SAL
	 * @param sal  the value for SCOTT.EMPLOYEE.SAL
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	public void setSal(Double sal) {
		this.sal = sal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column SCOTT.EMPLOYEE.COMM
	 * @return  the value of SCOTT.EMPLOYEE.COMM
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	public Double getComm() {
		return comm;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column SCOTT.EMPLOYEE.COMM
	 * @param comm  the value for SCOTT.EMPLOYEE.COMM
	 * @mbg.generated  Sun May 21 18:22:30 CST 2017
	 */
	public void setComm(Double comm) {
		this.comm = comm;
	}
}