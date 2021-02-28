/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parkinglot.domain;

import java.time.LocalDateTime;
import co.unicauca.parkinglot.infra.Utilities;
/**
 *
 * @author kevith Bastidas
 */
public class CarParkingCost implements IParkingCost{

    @Override
    public long calculateCost(Vehicle veh, LocalDateTime input, LocalDateTime output) {
        int vDife[] = Utilities.gerDiferencia(input, output);
        int horas = vDife[0]*24+vDife[1];
        int minutos = vDife[2];
        long result;
        if (horas<1) {
            return 2000;
        }else{
            float aux = ((float)minutos/60)*1000;
            result = 2000 + (horas - 1)*1000 + (long)aux;
        }       
        return Utilities.redondeo(result);
    }
    
}
