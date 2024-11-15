package com.example.springboottestingpractice.customer;

public record CreateCustomerRequest(String name,
                                    String email,
                                    String address) {
}