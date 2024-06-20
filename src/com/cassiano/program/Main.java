package com.cassiano.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.cassiano.model.Person;

public class Main {
	
	public static void main(String[] args) {
		Person person = new Person("Cassiano","M");
		Person person1 = new Person("Tales","M");
		Person person2 = new Person("Henrique","M");
		Person person3 = new Person("Luiz","M");
		Person person4 = new Person("Renata","F");
		Person person5 = new Person("Patricia","F");
		Person person6 = new Person("Leticia","F");
		Person person7 = new Person("Carina","F");
		Person person8 = new Person("Rita","F");
		Person person9 = new Person("Sabrina","F");
		Person person10 = new Person("Fernanda","F");
		
		List<Person> persons = Arrays.asList(person,person1, person2, person3, person4,person5,person6,person7,person8,person9,person10);
		
		List<Person> female = persons.stream().filter(e -> e.getGender().equals("F")).collect(Collectors.toList());
		
		female.forEach(e -> System.out.println(e));
	}
}
