package Procesadores;

import AbstractClasses.abstractProcesador;

import java.util.ArrayList;

public class Inventario {

    //LISTAS DE PROCESADORES

    ArrayList<abstractProcesador> procesadorArrayList =new ArrayList<abstractProcesador>();

    public void addProcesador(abstractProcesador procesador){
        procesadorArrayList.add(procesador);
    }
    @Override
    public String toString(){
        String cadena;
        cadena="LISTA DE PROCESADORES:\n\n";
        for (abstractProcesador cada: procesadorArrayList ) {
            cadena += (cada.getDescripcion() + " // Número de Serie " + cada.getNumSerie() + " // Precio " + cada.getPrecio()
                    + " // Temperatura " + cada.getCalor() + " // Número de Nucleos " + cada.getCores() + "\n");
        }
        return cadena;
    }
}
