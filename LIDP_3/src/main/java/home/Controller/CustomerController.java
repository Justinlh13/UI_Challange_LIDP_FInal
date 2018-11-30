package home.Controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import home.GetDate;
import home.GetName;
import home.Models.Customer;

//Testing out GET
@RestController
public class CustomerController {
	public String l = " ";

	@RequestMapping("/hello-world")
	public GetName greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new GetName();

	}

	public GetDate date(@RequestParam(value = "date", defaultValue = "World") String date) {
		return new GetDate();
	}

	// For POST
	// creates string for Customer URL
	private final static String POST_CUSTOMER_URL = "/api/post/customer";

	// Sends back to frontend when customer is created
	@PostMapping(POST_CUSTOMER_URL)
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {

		System.out.println("Creat Customer: " + customer);

		return ResponseEntity.ok(customer);
	}
}
