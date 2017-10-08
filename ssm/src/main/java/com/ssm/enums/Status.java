package com.ssm.enums;

public enum Status {
	SUCCESS(0,"成功"),
	FAIL(-1,"失败");
	
	private int stat;
	
	private String msg;

	
	
	private Status(int stat, String msg) {
		this.stat = stat;
		this.msg = msg;
	}

	public int getStat() {
		return stat;
	}

	public void setStat(int stat) {
		this.stat = stat;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public static Status stateOf(int index){
		for (Status stat :values()){
			if(stat.getStat()==index){
				return stat;
			}
		}
		return null;
	}

}
