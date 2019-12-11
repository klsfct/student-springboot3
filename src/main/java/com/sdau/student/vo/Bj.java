package com.sdau.student.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bj {
	
int id;
String bjname;



public Bj() {
	super();
}
@Id
@GeneratedValue
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBjname() {
	return bjname;
}
public void setBjname(String bjname) {
	this.bjname = bjname;
}
public Bj(int id, String bjname) {
	super();
	this.id = id;
	this.bjname = bjname;
}

public Bj(int id) {
	super();
	this.id = id;
}


}
