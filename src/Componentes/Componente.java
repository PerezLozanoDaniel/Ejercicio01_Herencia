package Componentes;

import Interfaces.IComponente;

public class Componente implements IComponente {
    String descripcion;
    String numSerie;
    int precio;
    int calor;

    public Componente(String descripcion, String numSerie, int precio, int calor) {
        this.descripcion = descripcion;
        this.numSerie = numSerie;
        this.precio = precio;
        this.calor = calor;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    public String getNumSerie() {
        return this.numSerie;
    }
    public int getPrecio() {
        return this.precio;
    }
    public int getCalor() {
        return this.calor;
    }
}

