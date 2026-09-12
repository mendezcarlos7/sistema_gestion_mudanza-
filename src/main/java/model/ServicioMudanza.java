package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class ServicioMudanza {

    private int id;
    private LocalDate fechaProgramada;
    private String cliente;
    private Direccion direccionOrigen;
    private Direccion direccionDestino;
    private ArrayList<Empleado> empleados;
    private Camion camion;
    private ArrayList<ObjetoTransportado> objetosTransportados;

    public ServicioMudanza() {
    }

    public ServicioMudanza(int id, LocalDate fechaProgramada, String cliente, Direccion direccionOrigen,
                           Direccion direccionDestino, ArrayList<Empleado> empleados, Camion camion,
                           ArrayList<ObjetoTransportado> objetosTransportados) {
        this.id = id;
        this.fechaProgramada = fechaProgramada;
        this.cliente = cliente;
        this.direccionOrigen = direccionOrigen;
        this.direccionDestino = direccionDestino;
        this.empleados = empleados;
        this.camion = camion;
        this.objetosTransportados = objetosTransportados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(LocalDate fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Direccion getDireccionOrigen() {
        return direccionOrigen;
    }

    public void setDireccionOrigen(Direccion direccionOrigen) {
        this.direccionOrigen = direccionOrigen;
    }

    public Direccion getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(Direccion direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    public ArrayList<ObjetoTransportado> getObjetosTransportados() {
        return objetosTransportados;
    }

    public void setObjetosTransportados(ArrayList<ObjetoTransportado> objetosTransportados) {
        this.objetosTransportados = objetosTransportados;
    }
}