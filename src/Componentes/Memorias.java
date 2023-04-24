package Componentes;

import Interfaces.IMemorizable;

public class Memorias implements IMemorizable {
    Componente caracteristicas;
    int almacenamiento;
    public Memorias(Componente caracteristicas, int almacenamiento) {
        this.caracteristicas = caracteristicas;
        this.almacenamiento = almacenamiento;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }
    public Componente getCaracteristicas() {
        return caracteristicas;
    }
}
