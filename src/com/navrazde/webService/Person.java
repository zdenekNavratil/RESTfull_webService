package com.navrazde.webService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private int SALARY;

	public int getSalary() {
		return SALARY;
	}

	public void setSalary(int salary) {
		this.SALARY = salary;
	}

	public void Person() {
	}

	public Person(String firstName, String lastName, int age, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.SALARY = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
