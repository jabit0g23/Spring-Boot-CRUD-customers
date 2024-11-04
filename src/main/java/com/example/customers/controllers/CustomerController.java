package com.example.customers.controllers;

import com.example.customers.entities.Customers;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class CustomerController {

    private  List<Customers> listC = new ArrayList<>();

    public CustomerController(){

        Customers c = new Customers();
        c.setId(1);
        c.setName("Javier");
        c.setLastname("Gonzalez");
        c.setAddress("asdasdasd");
        c.setEmail("asdasdasd");
        listC.add(c);

        Customers c2 = new Customers();
        c2.setId(2);
        c2.setName("Javier");
        c2.setLastname("Gonzalez");
        c2.setAddress("asdasdasd");
        c2.setEmail("asdasdasd");
        listC.add(c2);
    };

    @GetMapping("/customer/{id}") //traer un cliente
    public Customers getCustomer(@PathVariable Integer id){
        for (Customers customer : listC){
            if (customer.getId() == id){
                return  customer;
            }
        }
        return null;
    }

    @GetMapping("/customer") //traer todos los clientes
    public List<Customers> getAllCustomers(){
        return listC;
    }

    @DeleteMapping("/customer/{id}") //Eliminar cliente
    public void removeCustomer(@PathVariable Integer id){
        for (Customers customer : listC) {
            if (customer.getId() == id) {
                listC.remove(customer);
                break;
            }
        }
    }

    @PostMapping("/customer") //Agregar cliente
    public void addCustomer(@RequestBody Customers customer){
        listC.add(customer);
    }

    @PutMapping("/customer/{id}") //Modificar cliente
    public void updateCustomer(@PathVariable Integer id, @RequestBody Customers updateCustomer){
        for (Customers customer : listC) {
            if (customer.getId() == id) {
                listC.remove(customer);
                updateCustomer.setId(id);
                listC.add(updateCustomer);
                break;
            }
        }

    }

    //http://localhost:8080/customer/search/?name=javier
    @GetMapping("/customer/search") //Buscar cliente
    public List<Customers> searchCustomer(@RequestParam(name = "email" , required = false) String email,
                                          @RequestParam(name = "name", required = false) String name){

        List<Customers> searchResults = new ArrayList<>();

        if (email != null){
            for (Customers customer : listC) {
                if (customer.getEmail().contains(email)) {
                    searchResults.add(customer);
                }
            }
        }

        if (name != null) {
            for (Customers customer : listC) {
                if (customer.getName().contains(name)) {
                    searchResults.add(customer);
                }
            }
        }

        return searchResults;
    }
}
