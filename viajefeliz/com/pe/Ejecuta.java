package clases.Parcial.viajefeliz.com.pe;

import java.util.ArrayList;
import java.util.List;

public class Ejecuta {
    public static void main(String[] args) {
        int nDatos;
        List<Servicio>listado = new ArrayList<>();
        List<Bus>listadoBus = new ArrayList<>();
        Servicio servicio = new Servicio("Arequipa",listadoBus);
        Bus bus1 = new Bus("bus121",25,"LIAQ21");
        Bus bus2 = new Bus("bus122",26,"EFW423");
        Bus bus3 = new Bus("bus123",27,"GWQ423");
        Bus bus4 = new Bus("bus124",28,"EEE423");
        Bus bus5 = new Bus("bus125",29,"EHT423");
        Bus bus6 = new Bus("bus126",30,"MFVI423");
        listadoBus.add(bus1);
        listadoBus.add(bus2);
        listadoBus.add(bus3);
        listadoBus.add(bus4);
        listadoBus.add(bus5);
        listadoBus.add(bus6);
    }
}
