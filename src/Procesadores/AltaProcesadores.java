package Procesadores;

public class AltaProcesadores {
    intel_i7 intel_I7_789_XCS = new intel_i7("Procesador Intel i7","789-XCS",134,10,9);
    intel_i7 intel_I7_789_XCD = new intel_i7("Procesador Intel i7","789-XCD",138,12,10);
    intel_i7 intel_I7_789_XCT = new intel_i7("Procesador Intel i7","789-XCT",138,22,11);
    ryzen_AMD ryzen_AMD_797_X  = new ryzen_AMD("Procesador Ryzen AMD","797-X",78,30,10);
    ryzen_AMD ryzen_AMD_797_X2 = new ryzen_AMD("Procesador Ryzen AMD","797-X2",178,30,29);
    ryzen_AMD ryzen_AMD_797_X3 = new ryzen_AMD("Procesador Ryzen AMD","797-X3",78,60,34);

    Inventario inventarioProcesadores;

    public AltaProcesadores(Inventario inventarioProcesadores) {
        this.inventarioProcesadores = inventarioProcesadores;

        inventarioProcesadores.addProcesador(intel_I7_789_XCS);
        inventarioProcesadores.addProcesador(intel_I7_789_XCD);
        inventarioProcesadores.addProcesador(intel_I7_789_XCT);
        inventarioProcesadores.addProcesador(ryzen_AMD_797_X);
        inventarioProcesadores.addProcesador(ryzen_AMD_797_X2);
        inventarioProcesadores.addProcesador(ryzen_AMD_797_X3);
    }
}
