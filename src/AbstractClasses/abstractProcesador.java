package AbstractClasses;

import Interfaces.IProcesable;

abstract public class abstractProcesador implements IProcesable {
    private String descripcion;
    private String numSerie;
    private int precio;
    private int calor;
    private int cores;

    public abstractProcesador(String descripcion, String numSerie, int precio, int calor, int cores) {
        this.descripcion = descripcion;
        this.numSerie = numSerie;
        this.precio = precio;
        this.calor = calor;
        this.cores = cores;
    }

    private abstractProcesador() {
    }

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
