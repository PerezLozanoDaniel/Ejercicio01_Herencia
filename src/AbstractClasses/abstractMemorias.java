package AbstractClasses;

import Interfaces.IMemorizable;

abstract public class abstractMemorias implements IMemorizable {
    private String descripcion;
    private String numSerie;
    private int precio;
    private int calor;
    private int almacenamiento;

    public abstractMemorias(String descripcion, String numSerie, int precio, int calor, int almacenamiento) {
        this.descripcion = descripcion;
        this.numSerie = numSerie;
        this.precio = precio;
        this.calor = calor;
        this.almacenamiento = almacenamiento;
    }
    public String getDescripcion(){
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
    public int getAlmacenamiento() {
        return almacenamiento;
    }
}
