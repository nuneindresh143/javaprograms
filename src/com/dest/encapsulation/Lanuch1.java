package com.dest.encapsulation;

class Dog1
{
	private String name;
	private String color;
	private int age;
	private int cost;
	private String breed;
	
	//generic setter
	void setData(String name,int age,String color,int cost,String breed)
	{
		name = name;
		age = age;
		color = color;
		cost = cost;
		breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		age = age;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		cost = cost;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		breed = breed;
	}
	void getData()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}
}

public class Lanuch1 {
	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.setData("Tommy", 5, "Brown",7000, "Lab");
		d.getData();
		Dog1 d1 = new Dog1();
		d1.setName("Rocky");
		d1.setAge(4);
		d1.setColor("Yellow");
		d1.setCost(9000);
		d1.setBreed("Pug");
		System.out.println("========================");
		System.out.println(d1.getName());
		System.out.println(d1.getAge());
		System.out.println(d1.getColor());
		System.out.println(d1.getCost());
		System.out.println(d1.getBreed());
	}

}
