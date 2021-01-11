/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.programa;

import daw.raquel.Animal;
import daw.raquel.Persona;
import java.time.LocalDate;

/**
 *
 * @author raquel
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        //objeto animal por defecto
        Animal a1 = new Animal();
        
        //objeto animal parametrizado
        Animal a2 = new Animal(LocalDate.of(2020, 6, 4), "Saphi", Animal.Tipo.GATO, 400, Animal.Estado.DURMIENDO);
        
        //imprimir a1 y a2
        System.out.println("Animal a1:\n " + a1.toString());
        System.out.println("Animal a2:\n " + a2.toString());
        
        
        //clonar a2 en a3
        Animal a3 = Animal.clonar(a2);
        System.out.println("Animal a3:\n" + a3.toString());
        
        //contador de instancias
        System.out.println("N de instancias: " + Animal.getContadorInstancias());
        
        //creacion de dos personas
        Persona p1 = new Persona("Juan", 33);
        Persona p2 = new Persona("Alba", 21);
        
        //p1 despierta a los animales
        p1.llamar(a1);
        p1.llamar(a2);
        p1.llamar(a3);

        //p2 juega con a2 12m min
        p2.jugar(a2, 120);
        System.out.println("Peso de a2 despues de jugar con p2: " + a2.getGramos());
        
        
        //p1 alimenta a a1 1000 gramos, nuevo peso
        p1.alimentar(a1, 1000);
        System.out.println("Peso de a1 despues de comer: " + a1.getGramos());
        
        //FALTA CONTROLAR EXCEPCION
        
        //p1 juega con a1 200 min, nuevo peso
//        p1.jugar(a1, 200);
//        System.out.println("El animal a1 pesa " + a1.getGramos() + " después de jugar");
        
        
    }
    
}
