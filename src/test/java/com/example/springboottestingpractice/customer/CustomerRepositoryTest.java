package com.example.springboottestingpractice.customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureGraphQlTester;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    private  CustomerRepository customerRepository;

    @Test
    void shouldReturnCustomerWhenFindByEmail() {
        //given
        String email = "hussainmuzamil1010@gmail.com";
        Customer customer = Customer.create("Muzammil",
                email,
                "Karachi");

        customerRepository.save(customer);
        //when
        Optional<Customer> foundCustomer = customerRepository.findByEmail(email);
        //then
        assertThat(foundCustomer).isPresent();
    }
}