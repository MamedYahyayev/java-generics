/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.maqa.generics;

/**
 *
 * @author Windows10
 * @param <T>
 */
public interface CrudOperations<T extends Person> {

    public void save(T t);

}
