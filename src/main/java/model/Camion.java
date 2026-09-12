package model;

public class Camion {

    private String placa;
    private String marca;
    private double capacidadKg;

    public Camion() {
    }

    public Camion(String placa, String marca, double capacidadKg) {
        this.placa = placa;
        this.marca = marca;
        this.capacidadKg = capacidadKg;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacidadKg() {
        return capacidadKg;
    }

    public void setCapacidadKg(double capacidadKg) {
        this.capacidadKg = capacidadKg;
    }
}