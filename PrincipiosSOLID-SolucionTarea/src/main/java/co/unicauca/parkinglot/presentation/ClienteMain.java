/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parkinglot.presentation;

import co.unicauca.parkinglot.access.IVehicleRepository;
import co.unicauca.parkinglot.access.RepositoryFactory;
import co.unicauca.parkinglot.access.VehicleRepository;
import co.unicauca.parkinglot.domain.Vehicle;
import co.unicauca.parkinglot.domain.TypeEnum;
import co.unicauca.parkinglot.domain.service.Service;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;
/**
 *
 * @author kevith Bastidas
 */
public class ClienteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Vehicle veh = new Vehicle("FTK-123", TypeEnum.TRUCK);
//        LocalDateTime input = LocalDateTime.of(2021, Month.FEBRUARY, 22, 8, 0);
//        LocalDateTime output = LocalDateTime.of(2021, Month.FEBRUARY, 25, 9, 0);
//        IVehicleRepository repo = RepositoryFactory.getInstance().getRepository("default");
//        Service service = new Service(repo); //Inyección de dependencias
//        long result = service.calculateParkingCost(veh, input, output);
//        System.out.println("Valor a pagar por la moto: " + result);   
//        service.saveVehicle(veh);
//        veh = new Vehicle("JNK-124", TypeEnum.CAR);
//        service.saveVehicle(veh);
//        List<Vehicle> list = service.listVehicles();
//        list.forEach(vehicle -> {
//            System.out.println(vehicle.toString());
//        });
    }
    
}