/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.maqa.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Windows10
 */
public class PersonTest {

    @Test
    public void testGreet() {
        Person person = new Person();

        Assertions.assertEquals("Hello", person.greet());
    }
}
