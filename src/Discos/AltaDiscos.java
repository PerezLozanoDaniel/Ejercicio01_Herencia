package Discos;

public class AltaDiscos {
    datosDisco DiscoDuro_SanDisk_789_XX = new datosDisco("DiscoDuro SanDisk","789-XX",50,10,500000);
    datosDisco DiscoDuro_SanDisk_789_XX_2 = new datosDisco("DiscoDuro SanDisk","789-XX-2",90,29,1000000);
    datosDisco DiscoDuro_SanDisk_789_XX_3 = new datosDisco("DiscoDuro SanDisk","789-XX-3",128,39,2000000);
    datosDisco Disco_Mecanico_Patatin_788_fg  = new datosDisco("Disco Mecánico Patatin","788-fg",37,35,250);
    datosDisco Disco_Mecanico_Patatin_788_fg_2 = new datosDisco("Disco Mecánico Patatin","788-fg-2",67,35,250);
    datosDisco Disco_Mecanico_Patatin_788_fg_3 = new datosDisco("Disco Mecánico Patatin","788-fg-3",97,35,250);

    Inventario inventarioDiscos;

    public AltaDiscos(Inventario inventarioDiscos) {
        this.inventarioDiscos = inventarioDiscos;

        inventarioDiscos.addDisco(DiscoDuro_SanDisk_789_XX);
        inventarioDiscos.addDisco(DiscoDuro_SanDisk_789_XX_2);
        inventarioDiscos.addDisco(DiscoDuro_SanDisk_789_XX_3);
        inventarioDiscos.addDisco(Disco_Mecanico_Patatin_788_fg);
        inventarioDiscos.addDisco(Disco_Mecanico_Patatin_788_fg_2);
        inventarioDiscos.addDisco(Disco_Mecanico_Patatin_788_fg_3);
    }
}
