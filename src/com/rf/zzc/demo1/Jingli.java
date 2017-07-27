package com.rf.zzc.demo1;

public class Jingli extends Yuangong {
	private String jj;

	public String getJj() {
		return jj;
	}

	public void setJj(String jj) {
		this.jj = jj;
	}

	public Jingli(String name, String num, String money, String jj) {
		super(name, num, money);
		this.jj = jj;
	}

	@Override
	public String toString() {
		return "Jl [jj=" + jj + this.getName()+ this.getNum()+ this.getMoney()+"]";
	}
	
}
