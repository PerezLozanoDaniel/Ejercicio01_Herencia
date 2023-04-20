package Procesadores;

public class AltaProcesadores {
    datosProcesador intel_i7_789_XCS = new datosProcesador("Procesador Intel i7","789-XCS",134,10,9);
    datosProcesador intel_i7_789_XCD = new datosProcesador("Procesador Intel i7","789-XCD",138,12,10);
    datosProcesador intel_i7_789_XCT = new datosProcesador("Procesador Intel i7","789-XCT",138,22,11);
    datosProcesador ryzen_AMD_797_X  = new datosProcesador("Procesador Ryzen AMD","797-X",78,30,10);
    datosProcesador ryzen_AMD_797_X2 = new datosProcesador("Procesador Ryzen AMD","797-X2",178,30,29);
    datosProcesador ryzen_AMD_797_X3 = new datosProcesador("Procesador Ryzen AMD","797-X3",78,60,34);

    public AltaProcesadores(Inventario inventarioProcesadores) {

        inventarioProcesadores.addProcesador(intel_i7_789_XCS);
        inventarioProcesadores.addProcesador(intel_i7_789_XCD);
        inventarioProcesadores.addProcesador(intel_i7_789_XCT);
        inventarioProcesadores.addProcesador(ryzen_AMD_797_X);
        inventarioProcesadores.addProcesador(ryzen_AMD_797_X2);
        inventarioProcesadores.addProcesador(ryzen_AMD_797_X3);
    }
}
