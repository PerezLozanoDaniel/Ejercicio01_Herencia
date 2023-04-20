package Discos;

import AbstractClasses.abstractDiscos;

import java.util.ArrayList;

public class Inventario {

    //LISTAS DE DISCOS

    ArrayList<abstractDiscos> discoArrayList =new ArrayList<abstractDiscos>();

    public void addDisco(abstractDiscos disco){
        discoArrayList.add(disco);
    }
    @Override
    public String toString(){
        String cadena;
        cadena="LISTA DE PROCESADORES:\n\n";
        for (abstractDiscos cada: discoArrayList ) {
            cadena += (cada.getDescripcion() + " // Número de Serie " + cada.getNumSerie() + " // Precio " + cada.getPrecio()
                    + " // Temperatura " + cada.getCalor() + " // Tamaño de disco (MB) " + cada.getAlmacenamiento() + "\n");
        }
        return cadena;
    }
}
