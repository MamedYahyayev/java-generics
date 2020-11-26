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
public class Vehicle {

    private String id;

    private String name;

    private String carBrand;

    public Vehicle() {
    }

    public Vehicle(String id, String name, String carBrand) {
        this.id = id;
        this.name = name;
        this.carBrand = carBrand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", name=" + name + ", carBrand=" + carBrand + '}';
    }

}
