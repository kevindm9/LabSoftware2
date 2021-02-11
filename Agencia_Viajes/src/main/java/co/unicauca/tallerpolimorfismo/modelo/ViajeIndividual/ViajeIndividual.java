/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerpolimorfismo.modelo.ViajeIndividual;

import co.unicauca.tallerpolimorfismo.modelo.Viaje.Viaje;
import java.util.Date;

/**
 *
 * @author kevit
 */
public class ViajeIndividual extends Viaje{

    public ViajeIndividual(String origen, String destino, int costo, Date fechasalida, Date fechaLlegada) {
        super(origen, destino, costo, fechasalida, fechaLlegada);
    }

    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
    
}
