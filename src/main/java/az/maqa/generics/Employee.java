/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.maqa.generics;

/**
 *
 * @author Windows10
 */
public class Employee extends Person {

    private double salary;

    public Employee() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: Id - " + getId() + ", name - " + getName() + ", surname - " + getSurname() + ", salary - " + salary;
    }

}
