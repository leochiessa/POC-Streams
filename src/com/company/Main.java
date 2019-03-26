package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	List<Persona> Personas = new ArrayList<>();

	Personas = Arrays.asList(new Persona(12345678, 21, "juan"),
            new Persona(20000001, 31, "matias"),
            new Persona(87654321, 11, "nicolas"));

    List<Persona> Mayores21 = Personas.stream().filter(persona -> persona.getEdad() > 21).collect(Collectors.toList());
    List<Persona> Menores13 = Personas.stream().filter(persona -> persona.getEdad() < 13).collect(Collectors.toList());
    List<Persona> M21DNI20 = Personas.stream().filter(persona -> persona.getEdad() > 21).filter(persona -> persona.getDni() > 20000000).collect(Collectors.toList());

    System.out.println(Mayores21.toString());
    System.out.println(Menores13.toString());
    System.out.println(M21DNI20.toString());

    }
}