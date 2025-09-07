package furama.service;

import furama.entity.Employee;

import furama.repository.EmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public boolean add(Employee employee) {
        return employeeRepository.add(employee);
    }

    @Override
    public boolean update(int i, Employee employee) {
        if (i != 1) {
            return employeeRepository.update(i, employee);
        }
        return false;
    }

    @Override
    public boolean delete(String iDCus) {
        int i = isValid(iDCus);
        if (i != -1) {
            return employeeRepository.delete(i);
        }
        return false;
    }

    @Override
    public int isValid(String iD) {
        List<Employee> employeeList = findAll();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getiD().equals(iD)) {
                return i;
            }
        }
        return -1;
    }
}
