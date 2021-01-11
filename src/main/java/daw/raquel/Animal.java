/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.raquel;

import java.time.LocalDate;

/**
 *
 * @author raquel
 */


public class Animal {
    
    private LocalDate fecha;
    private String nombre;
    public enum Tipo {GATO, PERRO, LAGARTO, COBAYA, PERIQUITO}
    private Tipo tipo;
    private double gramos;
    public enum Estado {COMIENDO, DURMIENDO, DESPIERTO, REPOSO, JUGANDO}
    private Estado estado;
    
    private static int contadorInstancias = 0;

    // constructor por defecto
    public Animal() {
        
        this.fecha = LocalDate.now();
        this.tipo = Tipo.GATO;
        this.nombre = "Turrón";
        this.gramos = 2200;
        this.estado = Estado.DURMIENDO;
        
        contadorInstancias++;
 
    }

    // constructor parametrizado
    public Animal(LocalDate fecha, String nombre, Tipo tipo, double gramos, Estado estado) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.tipo = tipo;
        this.gramos = gramos;
        this.estado = estado;
        
        contadorInstancias++;
    }

    //getters y setters

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double getGramos() {
        return gramos;
    }

    public void setGramos(double gramos) {
        this.gramos = gramos;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    //otros metodos
    public void comer(double cantidadGramos) {
        if (cantidadGramos < 0) {
            cantidadGramos*=(-1);
        }
        
        this.gramos += cantidadGramos;
    }
    
    public void dormir() {
        this.estado = Estado.DURMIENDO;
    }
    
    public void despertar() {
        this.estado = Estado.DESPIERTO;
    }
    
    public void descansar() {
        this.estado = Estado.REPOSO;
    }
    
    public void jugar(int cantidadMinutos) {
        this.estado = Estado.JUGANDO;

        
        if (cantidadMinutos < 0) {
            cantidadMinutos *= (-1);
        }
        
        if (cantidadMinutos > 180) {
            throw new IllegalArgumentException("El tiempo de juego no puede superar los 180 min");
        }
        
        while (cantidadMinutos >= 30) {
            cantidadMinutos -= 30;
            this.gramos -= 20;

        }
        
        if (cantidadMinutos > 0 ||cantidadMinutos < 30) {
            this.gramos -= 10;
        }
    }

    @Override
    public String toString() {
        return "Animal{" + "fecha=" + fecha + ", nombre=" + nombre + ", tipo=" + tipo + ", gramos=" + gramos + ", estado=" + estado + '}';
    }
    
    //metodo de clase para clonar animales
    public static Animal clonar(Animal pet) {
        return new Animal(pet.getFecha(), pet.getNombre(), pet.getTipo(), pet.getGramos(), pet.getEstado());
    }
    
    //contador de instancias
    public static int getContadorInstancias() {
        return contadorInstancias;
    }
    
    
    
    
    
    
    
    
    
}


