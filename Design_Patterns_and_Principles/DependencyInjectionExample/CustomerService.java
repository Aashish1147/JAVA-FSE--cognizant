package DependencyInjectionExample;

class CustomerService {

    private CustomerRepository repository;

    // Constructor Injection
    CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    void getCustomer(int id) {
        System.out.println(repository.findCustomerById(id));
    }

}