package org.example.clases;

import org.example.interfaces.Acciones;

public class Junior extends Programador implements Acciones {
    private Double valorAuxilio;

    public Junior() {
    }

    @Override
    public void programar() {
        System.out.println("Soy un junior");
    }

    @Override
    public void renunciar() {

    }
}
