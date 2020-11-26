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
public class Student extends Person {

    private int course;

    public Student() {
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Stundent: Id - " + getId() + ", name - " + getName() + ", surname - " + getSurname() + ", course - " + course;
    }

}
