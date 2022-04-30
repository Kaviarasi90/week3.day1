package org.student;

import org.department.Department;

public class Student extends Department{
	public void studName() {
		System.out.println("Kavi");
		
	}
	public void studDept() {
		System.out.println("IT");
		
	}
	public void studID() {
		System.out.println("46182");
		
	}
	public static void main(String[] args) {
		Student jk=new Student();
		jk.studName();
		jk.studDept();
		jk.studID();
		jk.deptName();
		jk.collName();
		jk.collCode();
		jk.collRank();
	}

}
