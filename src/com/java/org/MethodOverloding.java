package com.java.org;


public class MethodOverloding {
public void empId(int id) {
	System.out.println("empid:"+id);

}
public void empId(String name) {
	System.out.println("empname:"+name);
	

}
public void empId(char initial,String name,int id,float d) {
	System.out.println("empdetails:"+initial+"."+name+":"+id+","+d);
}
public static void main(String[] args) {
	MethodOverloding m = new MethodOverloding();
	m.empId(123);
	m.empId("Jeni");
	m.empId('A', "Jeni", 123, 13f);
	
}
}
