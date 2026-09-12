package main;

import model.Camion;
import model.Direccion;
import model.Empleado;
import model.ObjetoTransportado;
import model.ServicioMudanza;
import service.ServicioMudanzaService;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ServicioMudanzaService servicioMudanzaService = new ServicioMudanzaService();

        Direccion direccionOrigen = new Direccion("Calle 10", "45-20", "Bogota", "110111");
        Direccion direccionDestino = new Direccion("Carrera 50", "12-34", "Medellin", "050001");

        Empleado empleado1 = new Empleado(1, "Carlos Perez", "Conductor", "3001112233");
        Empleado empleado2 = new Empleado(2, "Laura Gomez", "Auxiliar", "3004445566");
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado1);
        empleados.add(empleado2);

        Camion camion = new Camion("ABC123", "Chevrolet NPR", 3500.0);

        ObjetoTransportado objeto1 = new ObjetoTransportado("Sofa 3 puestos", 60.0, false);
        ObjetoTransportado objeto2 = new ObjetoTransportado("Televisor 55 pulgadas", 15.0, true);
        ArrayList<ObjetoTransportado> objetosTransportados = new ArrayList<>();
        objetosTransportados.add(objeto1);
        objetosTransportados.add(objeto2);

        ServicioMudanza servicio = new ServicioMudanza(
                1,
                LocalDate.of(2026, 10, 5),
                "Natalia Fanador",
                direccionOrigen,
                direccionDestino,
                empleados,
                camion,
                objetosTransportados);

        servicioMudanzaService.registrarServicio(servicio);

        for (ServicioMudanza s : servicioMudanzaService.listarServicios()) {
            System.out.println(s.getId());
            System.out.println(s.getFechaProgramada());
            System.out.println(s.getCliente());
            System.out.println(s.getDireccionOrigen().getCiudad());
            System.out.println(s.getDireccionDestino().getCiudad());
            System.out.println(s.getCamion().getPlaca());
            System.out.println(s.getEmpleados().size());
            System.out.println(s.getObjetosTransportados().size());
        }
    }
}