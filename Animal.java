import java.util.*;

public class Animal{
	public String name;
	public int numLegs;
	Animal(String name, int numLegs){
		this.name = name;
		this.numLegs = numLegs;
	}

	public int getLegs(){
		return this.numLegs;
	}
	public String getName(){
		return this.name;
	}
	@Override
	public String toString(){
		return this.name;
	}
}
class Dog extends Animal{
	public Dog(String name, int legs){
		super(name,legs);
	}

	
}

