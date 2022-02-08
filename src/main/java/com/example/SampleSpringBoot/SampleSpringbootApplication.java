package com.example.SampleSpringBoot;

import com.example.SampleSpringBoot.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class SampleSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringbootApplication.class, args);
	}

	@GetMapping("/message")
	public  List<Customer> getMessage(){
		return getCustomerList();
	}

	private static List<Customer> getCustomerList(){
		System.out.println("Inside the get Customer method");
		return     Arrays.asList(new Customer(100,41,"Ashok","USA",Arrays.asList("6093259605","9790792598")),
				new Customer(101,36,"Gouthami","USA",Arrays.asList("98851218999","1827379121")),
				new Customer(102,34,"Koushik","USA",Arrays.asList("1928378211","1829378912")),
				new Customer(103,22,"Anitha","USA",Arrays.asList("1823821218937","14236213611")));
	}
}
