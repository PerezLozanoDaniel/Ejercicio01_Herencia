package Ordenador;

import Componentes.*;

public class Ordenador {
    Procesador procesador;
    Memorias memoria;
    Discos disco;

    private int calorTotal;
    private int precioTotal;


    public Ordenador(Procesador procesador, Memorias memoria, Discos disco) {
        this.procesador = procesador;
        this.memoria = memoria;
        this.disco = disco;
        this.calorTotal = procesador.getCaracteristicas().getCalor()+memoria.getCaracteristicas().getCalor()+disco.getCaracteristicas().getCalor();
        this.precioTotal=procesador.getCaracteristicas().getPrecio()+memoria.getCaracteristicas().getPrecio()+disco.getCaracteristicas().getPrecio();
    }

    public int getCalorTotal() {
        return this.calorTotal;
    }

    public int getPrecioTotal() {
        return this.precioTotal;
    }
}
