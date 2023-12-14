package javaconreact.javaconreact.services;

import javaconreact.javaconreact.entities.Customer;
import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();
    Customer getById(Long id);
    void remove(Long id);
    void save(Customer customer);
}
