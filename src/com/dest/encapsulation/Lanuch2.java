package com.dest.encapsulation;


class Cricketer
{
	private String name;
	private int age;
	private String position;
	void setData(String name,int age,String position)
	{
		this.name = name;
		this.age = age;
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	void getData()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(position);
	}
}

public class Lanuch2 {
public static void main(String[] args) {
	Cricketer c = new Cricketer();
	c.setData("Rohit", 40, "Right Hand");
	c.getData();
	Cricketer c1 = new Cricketer();
	c1.setName("Virkat");
	c1.setAge(36);
	c1.setPosition("Right Hand");
	System.out.println("===============================");
	System.out.println(c1.getName());
	System.out.println(c1.getAge());
	System.out.println(c1.getPosition());
}
}
