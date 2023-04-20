//import Discos.*;
//import Memorias.*;
import Procesadores.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Procesadores.Inventario inventarioProcesadores = new Inventario();

        new AltaProcesadores(inventarioProcesadores);

        System.out.println(inventarioProcesadores);
    }




}
