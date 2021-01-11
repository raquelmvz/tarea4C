/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.raquel;

/**
 *
 * @author raquel
 */
public class Persona {
    private String nombre;
    private int edad;
    
    //constructor parametrizado

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //metodo que hace que una persona despierte a un animal
    public void llamar(Animal pet) {
        pet.despertar();
    }
    
    //persona alimenta a mascota con x cant
    public void alimentar(Animal pet, double cantidadGramos) {
        pet.comer(cantidadGramos);
    }
    
    //persona juega con pet
    public void jugar(Animal pet, int cantidadMinutos) {
        pet.jugar(cantidadMinutos);
    }
    
    //falta excepcion!!!!
    
}
