package entity;

import java.util.HashSet;
import java.util.Set;


public class Dept {
 
	public Dept() {
		super();
	}

	public Dept(int deptno, String dname) {
		super();
		this.deptno = deptno;
		this.dname = dname;
	}

	private int deptno;
	private String dname;
	private String loc;
    private Set<Emp> emps=new HashSet<Emp>();
    
	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

}
