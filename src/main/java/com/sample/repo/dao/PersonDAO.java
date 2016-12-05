package com.sample.repo.dao;

import java.util.List;

import com.sample.repo.domain.Person;

public interface PersonDAO {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(long id);
	public void removePerson(long id);
}