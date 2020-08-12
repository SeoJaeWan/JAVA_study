package hi2;

import java.util.HashSet;
import java.util.Set;

public class Study_HashSet_Person {

	public static void main(String[] args) {

		Set set = new HashSet();

		set.add(new Person1("David",10));
		set.add(new Person1("David",10));
		
		set.add(new Person2("Inyeo",15));
		set.add(new Person2("Inyeo",15));
		
		Person2 p = new Person2("Inyeo",15);
		int hashCode = p.hashCode();
		
		System.out.println(p);
		System.out.println(new Person2("Inyeo",15));
		
		System.out.println(set);
	}
}

class Person1{
	
	String name;
	int age;
	
	public Person1(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + " : " + age;
	}
}

class Person2{
	
	String name;
	int age;
	
	public Person2 (String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Person2) {
			Person2 p2 = (Person2)o;
			return name.equals(p2.name) && age == p2.age;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return (name + age).hashCode();
	}
	
	public String toString() {
		return name + " : " + age;
	}
}