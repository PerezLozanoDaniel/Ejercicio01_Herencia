package Memorias;

import AbstractClasses.abstractMemorias;

import java.util.ArrayList;

public class Inventario {

    //LISTAS DE MEMORIAS

    ArrayList<abstractMemorias> memoriaArrayList =new ArrayList<abstractMemorias>();

    public void addMemoria(abstractMemorias memoria){
        memoriaArrayList.add(memoria);
    }
    @Override
    public String toString(){
        String cadena;
        cadena="LISTA DE MEMORIAS:\n\n";
        for (abstractMemorias cada: memoriaArrayList ) {
            cadena += (cada.getDescripcion() + " // Número de Serie " + cada.getNumSerie() + " // Precio " + cada.getPrecio()
                    + " // Temperatura " + cada.getCalor() + " // Tamaño de la memoria (MB): " + cada.getAlmacenamiento() + "\n");
        }
        return cadena;
    }
}
