package com.example.spiketaass.controllers;

import com.example.spiketaass.models.Customer;
import com.example.spiketaass.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1") //dice la url del servizio
public class CustomerController {
    @Autowired //auto collegato, non faremo mai una new, lo fa Spring
    private CustomerRepository customerRepository;

    @GetMapping("/customers") //URL completo http://localhost:8080/api/v1/customers
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    @PostMapping(value="/customers/create")
    @ResponseStatus(HttpStatus.OK) //inviato quando è conclusa la create
    public void create(@RequestBody Customer customer) { //va a prendere dal body della richiesta http e lo mette in Customer
        customerRepository.save(customer);
    }

}
