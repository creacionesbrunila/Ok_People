package javaconreact.javaconreact.controllers;

import javaconreact.javaconreact.entities.Customer;
import javaconreact.javaconreact.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private ICustomerService service;
    @GetMapping("/api/customers")
    public List<Customer> getAll() {
    return service.getAll();
    }

    @GetMapping("/api/customers/{id}")
    public Customer getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/customers/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Long.parseLong(id));
    }

    @PostMapping("/api/customers")
    public void save(@RequestBody Customer customer) {
        service.save(customer);
    }

//    En el contexto de una aplicación REST, cuando envías datos al servidor, ya sea para crear o
//    actualizar recursos, esos datos generalmente se envían en el cuerpo de la solicitud en un formato como JSON o XML.
//    La anotación @RequestBody ayuda a convertir esos datos del cuerpo de la solicitud en un objeto Java.
}
