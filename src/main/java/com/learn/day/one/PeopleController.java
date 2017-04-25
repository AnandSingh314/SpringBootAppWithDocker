/**
 * 
 */
package com.learn.day.one;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.GsonBuilder;

/**
 * @author Anand Singh <email: avsmips@gmail.com>
 *
 */

@RestController
public class PeopleController {

	@RequestMapping(value = "findPeople", method = { RequestMethod.GET }, produces = { "application/json" })
	public List<Person> findPeople() {
		List<Person> people = 
				Arrays.asList(
						new Person(1, "Anand", "Singh","cs", false),
						new Person(2, "Shubham", "Rajput", "civil", false), 
						new Person(3, "Ayush", "Srivastava", "civil", false), 
						new Person(4, "Vikash", "Singh", "cs", false), 
						new Person(5,"Neha", "Omar", "cs", false),
						new Person(6, "Karan","arora", "it", false),
						new Person(7, "Pooja", "Singh","art", false), 
						new Person(8, "Gaurav", "Pandey", "cs",false), 
						new Person(9, "Amar", "Gupta", "ME", false));

		return 
				people.stream()
					  .parallel()
				      .map(person -> {	person.setStatus(true);	return person;})
				      .collect(Collectors.toList());
		// return new GsonBuilder().create().toJson(people.stream()
		// .parallel()
		// .filter(person -> person.getDepartment().startsWith("c"))
		// //.forEach(person->person.setFname("Mr. "+person.getFname()))
		// .collect(Collectors.toList()));

	}
}
