package Componentes;

import Interfaces.IGuardable;

public class Discos implements IGuardable {
    Componente caracteristicas;
    int almacenamiento;

    public Discos(Componente caracteristicas, int almacenamiento) {
        this.caracteristicas = caracteristicas;
        this.almacenamiento = almacenamiento;
    }

    public int getAlmacenamiento() {
        return this.almacenamiento;
    }

    public Componente getCaracteristicas() {
        return caracteristicas;
    }
}
