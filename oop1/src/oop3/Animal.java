package oop3;

public abstract class Animal {
	public String name;
	protected float can_nang;

	public void eat() {
		System.out.print("eattttt");
	}

	abstract void speak();

	abstract void move();
}
