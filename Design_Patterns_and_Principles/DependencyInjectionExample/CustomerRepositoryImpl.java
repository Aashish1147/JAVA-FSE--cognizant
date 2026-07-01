package DependencyInjectionExample;

class CustomerRepositoryImpl implements CustomerRepository {

    public String findCustomerById(int id) {
        return "Customer Found : ID = " + id;
    }

}