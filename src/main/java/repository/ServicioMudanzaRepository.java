package repository;

import model.ServicioMudanza;
import java.util.ArrayList;

public class ServicioMudanzaRepository {

    private ArrayList<ServicioMudanza> servicios = new ArrayList<>();

    public void guardar(ServicioMudanza servicio) {
        servicios.add(servicio);
    }

    public ArrayList<ServicioMudanza> listar() {
        return servicios;
    }
}