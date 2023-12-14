package javaconreact.javaconreact.services;

import javaconreact.javaconreact.entities.Customer;
import javaconreact.javaconreact.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository repository;

    @Override
    public List<Customer> getAll() {
        return (List<Customer>) repository.findAll();
    }

//    public List<Customer> getAll() {
//        Iterable<Customer> customerIterable = repository.findAll();
//        List<Customer> customers = new ArrayList<>();
//
//        for (Customer customer : customerIterable) {
//            customers.add(customer);
//        }
//
//        return customers;
//    }

    @Override
    public Customer getById(Long id) {
        return (Customer) repository.findById(id).get();
    }
//    La razón por la que se utiliza .get() en el código que proporcionaste está relacionada con el
//    uso de Optional en Java. El método findById(id) de un repositorio en Spring Data JPA devuelve un Optional.
//    El propósito de Optional es representar un valor que puede o no existir sin necesidad de manejar casos de null.
//    Esto ayuda a evitar NullPointerExceptions al acceder a valores que podrían ser nulos.
    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
//    la elección entre usar o no .get() y realizar un casting depende del tipo de operación que estás realizando.
//    Si solo necesitas eliminar un registro según su id, como en este caso, usar deleteById(id) directamente es una práctica común y
//    más eficiente. Si necesitas realizar alguna operación adicional con el objeto antes de eliminarlo,
//    entonces podría tener sentido recuperar el objeto completo utilizando findById(id).
    @Override
    public void save(Customer customer) {
        repository.save(customer);
    }
}
