package fistpart.employee;

import java.util.Locale;

import utils.ClearTerminal;

public class EmployeeClient {
    
    public static void main(String[] args) {
        ClearTerminal.run();
        Locale.setDefault(Locale.US);

        Employee e1 = new Employee("Bob", "Red", 3000.00);
        System.out.println(e1);

        e1.setSalary(e1.getSalary() * 1.1);
        System.out.println(e1);

    }

}
