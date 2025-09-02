package furama.service;

import furama.entity.Customer;

public interface ICustomerService extends IService<Customer> {
    int isValid(String iD);
}
