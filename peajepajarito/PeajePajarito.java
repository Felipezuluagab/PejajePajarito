/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peajepajarito;

import Vehiculos.Automovil;
import Vehiculos.CamionUnEje;
import Vehiculos.CamionVariosEjes;
import Vehiculos.Moto;
import Vehiculos.Vehiculos;
import java.util.ArrayList;

/**
 *
 * @author b03s208
 */
public class PeajePajarito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Vehiculos> vehiculos = new ArrayList<Vehiculos>();
        vehiculos.add(new Moto("EFG69F", "Ducati"));
        vehiculos.add(new Automovil("QWE734", "Maserati"));
        vehiculos.add(new CamionUnEje("MUT234", "Mack"));
        vehiculos.add(new CamionVariosEjes("YUO561", "Kentwork"));
        vehiculos.add(new Moto("ABC-60A","Yamaha"));
        vehiculos.add(new Automovil("ABD-254", "Audi"));
        vehiculos.add(new CamionVariosEjes("ERT-54", "Kenworth"));
        vehiculos.add(new CamionUnEje("ERT-25", "Toyota"));
        vehiculos.add(new Moto("ABC-60r","Suzuki"));
        vehiculos.add(new Automovil("ABD-123", "Lambo"));

        System.out.println(vehiculos);
        System.out.println("Uno de los vehículos en Json convertido a XML sería:");
        System.out.println("<Vehiculo>\n"
                + "	<Automovil placa = ABD-123 marca=Lambo valor=15000></Automovil>\n"
                + "</Vehículo>");
    }

}


