package service;

import model.Cliente;
import repository.ClienteRepository;
import java.util.ArrayList;

public class ClienteService {

    private ClienteRepository clienteRepository = new ClienteRepository();

    public void registrarCliente(Cliente cliente) {
        clienteRepository.guardar(cliente);
    }

    public ArrayList<Cliente> listarClientes() {
        return clienteRepository.listar();
    }

}