package br.com.erudio.person.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.erudio.person.model.Person;

//Spring injeta dependecias dessa classe sem instanciar
@Service
public class PersonServices {

	//Simula ID no banco de dados
	private final AtomicLong counter = new AtomicLong();

	public Person create(Person person) {		
		return person;
	}
	
	public Person update(Person person) {		
		return person;
	}
	
	public void delete(String id) {
		
	}
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirtsName("Maria");
		person.setLastName("Souza");
		person.setAdress("São José dos Campos - SP");
		person.setGender("Female");
		
		return person;
	}
	
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();
		for(int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		
		return persons;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirtsName("First Name " + i);
		person.setLastName("Last Name " + i);
		person.setAdress("Adress Brasil " + i);
		person.setGender("Female " + i);
		
		return person;
	}
	
}
