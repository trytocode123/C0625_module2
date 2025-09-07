package furama.service;

import furama.entity.Customer;
import furama.repository.CustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public boolean add(Customer customer) {
        List<Customer> customers = customerRepository.findAll();
        for (Customer customerEle : customers) {
            if (customerEle.getiD().equals(customer.getiD())) {
                return false;
            }
        }
        return customerRepository.add(customer);
    }

    @Override
    public boolean update(int i, Customer customer) {
        if (i != 1) {
            return customerRepository.update(i, customer);
        }
        return false;
    }

    @Override
    public boolean delete(String iDCus) {
        int i = isValid(iDCus);
        if (i != -1) {
            return customerRepository.delete(i);
        }
        return false;
    }

    @Override
    public int isValid(String iD) {
        List<Customer> customerList = findAll();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getiD().equals(iD)) {
                return i;
            }
        }
        return -1;
    }
}
