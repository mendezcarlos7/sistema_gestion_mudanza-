package service;

import model.ServicioMudanza;
import repository.ServicioMudanzaRepository;
import java.util.ArrayList;

public class ServicioMudanzaService {

    private ServicioMudanzaRepository servicioMudanzaRepository = new ServicioMudanzaRepository();

    public void registrarServicio(ServicioMudanza servicio) {
        servicioMudanzaRepository.guardar(servicio);
    }

    public ArrayList<ServicioMudanza> listarServicios() {
        return servicioMudanzaRepository.listar();
    }
}