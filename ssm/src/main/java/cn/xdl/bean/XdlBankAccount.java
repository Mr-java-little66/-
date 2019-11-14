package cn.xdl.bean;

import java.io.Serializable;

public class XdlBankAccount implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "XdlBankAccount [name=" + name + ", password=" + password + "]";
	}
	public XdlBankAccount(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public XdlBankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
