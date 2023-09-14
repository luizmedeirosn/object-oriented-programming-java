package fistpart.employee;

import java.math.BigDecimal;

public class Employee {
    
    private String name;
    private String surname;
    private BigDecimal salary;

    public Employee() {
    }

    public Employee(String name, String surname, Double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = new BigDecimal(String.format("%.2f", salary));
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public Double getSalary() {
        return salary.doubleValue();
    }
    
    public void setSalary(Double salary) {
        try {
            BigDecimal value = new BigDecimal(String.format("%.2f", salary));
            BigDecimal zero = new BigDecimal("0.0");

            if (value.compareTo(zero) >= 0) {
                this.salary = value;
            } else {
                throw new IllegalArgumentException("Enter valid values");
            }

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Unexpected error");
        }
        // catch (Exception e) {
        //     e.printStackTrace();
        // }
    }

    @Override
    public String toString() {
        return String.format(
            "{%n" +
            "   name: %s,%n" +
            "   surname: %s,%n" +
            "   salary: %.2f%n" +
            "}%n",
            name, surname, salary
        );
    }

}
