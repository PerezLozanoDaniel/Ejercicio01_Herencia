package AbstractClasses;

import Interfaces.IGuardable;

abstract public class abstracDiscos implements IGuardable {
    private String descripcion;
    private String numSerie;
    private int precio;
    private int calor;
    private int almacenamiento;

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
