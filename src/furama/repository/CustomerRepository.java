package furama.repository;

import furama.entity.Customer;
import ss8_mvc.bai_1.util.ReadFileAndWriteFile;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {

    final static String pathFile = "src/furama/data/customer.csv";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        try {
            List<String> stringList = ReadFileAndWriteFile.readFileCSV(pathFile);
            String[] array = null;
            for (String string : stringList) {
                array = string.split(",");
                Customer customer = new Customer(array[0], array[1], LocalDate.parse(array[2], dateTimeFormatter), Boolean.parseBoolean(array[3]), array[4], array[5], array[6], array[7], array[8]);
                customerList.add(customer);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        return customerList;
    }

    @Override
    public boolean add(Customer customer) {
        List<String> customerList = new ArrayList<>();
        customerList.add(customer.getInfoToCSV());
        try {
            ReadFileAndWriteFile.writeFileCSV(pathFile, customerList, true);
        } catch (IOException e) {
            System.out.println("Error of writing file");
        }
        return true;
    }

    @Override
    public boolean update(int i, Customer customer) {
        try {
            List<String> customerList = ReadFileAndWriteFile.readFileCSV(pathFile);
            customerList.set(i, customer.getInfoToCSV());
            ReadFileAndWriteFile.writeFileCSV(pathFile, customerList, false);
            return true;
        } catch (IOException e) {
            System.out.println("Error of reading file");
            return false;
        }
    }
}
