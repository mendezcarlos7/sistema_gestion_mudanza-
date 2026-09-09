package main;

import model.Cliente;
import service.ClienteService;

public class Main {

    public static void main(String[] args) {
        ClienteService clienteService = new ClienteService();

        Cliente cliente = new Cliente(
                1,
                "Carlos",
                "3232345675",
                "carlos@gmail.com"
        );

        clienteService.registrarCliente(cliente);
        for (Cliente c : clienteService.listarClientes()) {
            System.out.println(c.getId());
            System.out.println(c.getNombre());
            System.out.println(c.getTelefono());
            System.out.println(c.getCorreo());
        }

    }

}
