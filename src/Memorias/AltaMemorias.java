package Memorias;

public class AltaMemorias {
    datosMemorias Memoria_SDRAM_879FH = new datosMemorias("Banco de Memoria SDRAM","879FH",100,10,512);
    datosMemorias Memoria_SDRAM_879FH_L = new datosMemorias("Banco de Memoria SDRAM","879FH-L",125,15,1000);
    datosMemorias Memoria_SDRAM_879FH_T = new datosMemorias("Banco de Memoria SDRAM","879FH-T",150,24,2000);

    public AltaMemorias(Inventario inventarioProcesadores) {

        inventarioProcesadores.addMemoria(Memoria_SDRAM_879FH);
        inventarioProcesadores.addMemoria(Memoria_SDRAM_879FH_L);
        inventarioProcesadores.addMemoria(Memoria_SDRAM_879FH_T);

    }
}
