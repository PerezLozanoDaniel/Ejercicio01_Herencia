package Procesadores;

import Interfaces.IProcesable;

abstract public class abstracProcesador implements IProcesable {
    private String descripcion;
    private String numSerie;
    private int precio;
    private int calor;
    private int cores;

    public String getDescripcion() {
        return descripcion;
    }
    public String getNumSerie() {
        return numSerie;
    }
    public int getPrecio() {
        return precio;
    }
    public int getCalor() {
        return calor;
    }
    public int getCores() {
        return cores;
    }


}
