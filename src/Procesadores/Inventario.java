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
        for (abstractProcesador cadaProcesador: procesadorArrayList ) {
            cadena += (cadaProcesador.getDescripcion() + " // Número de Serie " + cadaProcesador.getNumSerie() + " // Precio " + cadaProcesador.getPrecio()
                    + " // Temperatura " + cadaProcesador.getCalor() + " // Número de Nucleos " + cadaProcesador.getCores() + "\n");
        }
        return cadena;
    }
}
