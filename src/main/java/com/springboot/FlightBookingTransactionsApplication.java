package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableTransactionManagement
public class FlightBookingTransactionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingTransactionsApplication.class, args);
	}

}
