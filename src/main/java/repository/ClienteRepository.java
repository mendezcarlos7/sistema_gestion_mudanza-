package repository;

import model.Cliente;
import java.util.ArrayList;

public class ClienteRepository {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void guardar(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> listar() {
        return clientes;
    }

}