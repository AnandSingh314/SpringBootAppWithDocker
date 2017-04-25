/**
 * 
 */
package com.learn.day.one;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Anand Singh <email: avsmips@gmail.com>
 *
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	private int id;
	private String fname;
	private String lname;
	private String department;
	private boolean status;
}
