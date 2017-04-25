/**
 * 
 */
package com.learn.day.one;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anand Singh <email: avsmips@gmail.com>
 *
 */

@RestController
@RequestMapping(value = "", method = { RequestMethod.GET, RequestMethod.POST }, produces = { "application/json" })
public class RootController {

	@RequestMapping("/")
	public String rootContext() {

		return "Service is Up & Running.";
	}
}
