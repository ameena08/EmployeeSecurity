/**
 * 
 */
package com.ust.EmployeeSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 *
 */

@RestController
@RequestMapping("/rest1/auth1")
public class EmployeeController {
	@GetMapping("/goodmorning")
	public String greeting() {
		return "Hi Ameena,Good morning";
	}

}
