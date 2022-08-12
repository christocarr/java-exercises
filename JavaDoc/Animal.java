package JavaDoc;

/**
 * 
 * @author Chris Carr
 * @version 02.08.2022
 * Class Animal
 */
public abstract class Animal {
	private int age;
	private String gender;
	
	/**
	 * Constructor for Animal class
	 */
	public Animal(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}
	
	/*
	 * @return String gender of this Animal
	 */
	public String getGender() {
		return gender;
	}
	
	public abstract void makeSound();
}
