import Interfaces.*;
import Ordenador.Ordenador;
import Componentes.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*
        Procesador intel_i7_789_XCS = new Procesador(new Componente("Procesador Intel i7","789-XCS",134,10),9);
        Memorias SDRAM_879FH = new Memorias(new Componente("Banco de Memoria SDRAM","879FH",100,10),512);
        Discos SanDisk_789_XX =new Discos(new Componente("DiscoDuro SanDisk","789-XX",50,10),500000);
        Ordenador ordenadorMaria = new Ordenador(intel_i7_789_XCS,SDRAM_879FH,SanDisk_789_XX);
        */


        Ordenador ordenadorMaria =  new Ordenador
                                    (new Procesador(new Componente("Procesador Intel i7","789-XCS",134,10),9),
                                    new Memorias(new Componente("Banco de Memoria SDRAM","879FH",100,10),512),
                                    new Discos(new Componente("DiscoDuro SanDisk","789-XX",50,10),500000));

        System.out.println("El precio del ordenadore de Maria es: "+ordenadorMaria.getPrecioTotal());
        System.out.println("El calor del ordenadore de Maria es: "+ordenadorMaria.getCalorTotal());



    }


}
