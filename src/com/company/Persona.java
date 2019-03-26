package com.company;

public class Persona {
    private int dni;
    private int edad;
    private String nombre;

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(int dni, int edad, String nombre) {
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.getNombre() + " - Edad: " + this.getEdad() + "  - DNI: " + this.getDni();
    }
}