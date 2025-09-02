package furama.repository;

import furama.entity.Employee;
import ss8_mvc.bai_1.util.ReadFileAndWriteFile;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

    final static String pathFile = "src/furama/data/employee.csv";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            List<String> stringList = ReadFileAndWriteFile.readFileCSV(pathFile);
            String[] array = null;
            for (String string : stringList) {
                array = string.split(",");
                Employee employee = new Employee(array[0], array[1], LocalDate.parse(array[2], dateTimeFormatter), Boolean.parseBoolean(array[3]), array[4], array[5], array[6], array[7], array[8], Integer.parseInt(array[9]));
                employeeList.add(employee);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        return employeeList;
    }

    @Override
    public boolean add(Employee employee) {
        List<String> employeeList = new ArrayList<>();
        employeeList.add(employee.getInfoToCSV());
        try {
            ReadFileAndWriteFile.writeFileCSV(pathFile, employeeList, true);
        } catch (IOException e) {
            System.out.println("Error of writing file");
        }
        return true;
    }

    @Override
    public boolean update(int i, Employee employee) {
        try {
            List<String> employeeList = ReadFileAndWriteFile.readFileCSV(pathFile);
            employeeList.set(i, employee.getInfoToCSV());
            ReadFileAndWriteFile.writeFileCSV(pathFile, employeeList, false);
            return true;
        } catch (IOException e) {
            System.out.println("Error of reading file");
            return false;
        }
    }
}
