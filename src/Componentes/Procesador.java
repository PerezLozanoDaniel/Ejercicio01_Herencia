package Componentes;

import Interfaces.IProcesable;
public class Procesador implements IProcesable {
    Componente caracteristicas;
    int cores;
    public Procesador(Componente caracteristicas, int cores) {
        this.caracteristicas = caracteristicas;
        this.cores = cores;
    }
    public int getCores() {
        return this.cores;
    }
    public Componente getCaracteristicas() {
        return caracteristicas;
    }
}



