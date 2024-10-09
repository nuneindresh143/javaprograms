package com.dest.encapsulation;

class D1
{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	//zero parameterized constructor
	public D1() {
		super();
		System.out.println("showing values after executing 0 parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("=================================");
	}
	//single parameterized constructor
	public D1(String name)
	{
		this("tommy","yellow");
		this.name = name;
		System.out.println("showing values after executing 1 parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("=================================");
	}
	//Two parameterized constructor
	public D1(String name, String color)
	{
		this("Rocky","brown",7000);
		this.name = name;
		this.color = color;
		System.out.println("showing values after executing 2 parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("=================================");
	}
	//Three parameterized constructor
	public D1(String name,String color,int cost)
	{
		this("Shocky","black",8000,5);
		this.name = name;
		this.color = color;
		this.cost = cost;
		System.out.println("showing values after executing 3 parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("=================================");
	}
	//Four parameterized constructor
	public D1(String name,String color,int cost,int age)
	{
		this("bunty","white",9000,6,"GR");
		this.name = name;
		this.color = color;
		this.cost = cost;
		this.age = age;
		System.out.println("showing values after executing 4 parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("=================================");
	}
	//Five parameterized constructor
	public D1(String name,String color,int cost,int age,String breed)
	{
		this();
		this.name = name;
		this.color = color;
		this.cost = cost;
		this.age = age;
		this.breed = breed;
		System.out.println("showing values after executing 5 parameterized constructor");
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);
		System.out.println("=================================");
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getCost() {
		return cost;
	}
	public int getAge() {
		return age;
	}
	public String getBreed() {
		return breed;
	}	
}
public class LanuchDog {
public static void main(String[] args) {
	D1 d = new D1("Vicky");
	System.out.println(d.getName());
	System.out.println(d.getColor());
	System.out.println(d.getCost());
	System.out.println(d.getAge());
	System.out.println(d.getBreed());
}
}
