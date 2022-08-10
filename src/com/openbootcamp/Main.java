package com.openbootcamp;

public class Main {
    public static void main(String[] args) {
        Persona nuevaPersona = new Persona();

        nuevaPersona.setEdad(22);
        nuevaPersona.setNombre("Andre");
        nuevaPersona.setTelefono("51999944444");

        System.out.println("Edad: " + nuevaPersona.getEdad());
        System.out.println("Nombre: " + nuevaPersona.getNombre());
        System.out.println("Teléfono: " + nuevaPersona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return this.telefono;
    }
}