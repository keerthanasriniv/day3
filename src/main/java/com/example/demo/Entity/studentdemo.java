package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_demo")
public class studentdemo
{
	@Id
	@Column(name="sid")
	private int sid;
	@Column(name="sname")
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public studentdemo(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public studentdemo()
	{
		
	}
	
}