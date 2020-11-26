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
public class MainClass {

    public static void main(String[] args) {
        Person person = new Person();
        person.setId("dsad1412213412dasfdas");
        person.setName("Samir");
        person.setSurname("Samirov");

        Employee employee = new Employee();
        employee.setId("sdasadas");
        employee.setName("Camal");
        employee.setSurname("Camalov");
        employee.setSalary(1200);

        Student student = new Student();
        student.setId("sdasadas");
        student.setName("Camaldsad");
        student.setSurname("Camaloasdsaddav");
        student.setCourse(2);

        CrudOperationsImpl<Person> personOperations = new CrudOperationsImpl<>();
        personOperations.save(person);

        CrudOperationsImpl<Employee> employeeOperations = new CrudOperationsImpl<>();
        employeeOperations.save(employee);

        CrudOperationsImpl<Student> studentOperations = new CrudOperationsImpl<>();
        studentOperations.save(student);

        // We can not pass Vahicle class beacuse Vehicle class doesn't extends Person
        //CrudOperationsImpl<Vehicle> vehicleOperations = new CrudOperationsImpl<>();
        //vehicleOperations.save(new Vehicle("23131", "2107", "LADA"));
    }

}
