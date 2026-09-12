package model;

public class ObjetoTransportado {

    private String descripcion;
    private double pesoKg;
    private boolean fragil;

    public ObjetoTransportado() {
    }

    public ObjetoTransportado(String descripcion, double pesoKg, boolean fragil) {
        this.descripcion = descripcion;
        this.pesoKg = pesoKg;
        this.fragil = fragil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }
}