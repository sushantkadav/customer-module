package in.avenues.customermodule.customer;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;
    private ModelMapper modelMapper;

    public CustomerService(CustomerRepository customerRepository, ModelMapper modelMapper) {
        this.customerRepository = customerRepository;
        this.modelMapper = modelMapper;
    }

    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        Customer c = new Customer();
        if (customerDTO.getId() != null) {
            c = customerRepository.findById(customerDTO.getId()).get();
        }
        modelMapper.map(customerDTO, c);

        var savedCustomer = customerRepository.save(c);
        return modelMapper.map(savedCustomer, CustomerDTO.class);

    }
}
