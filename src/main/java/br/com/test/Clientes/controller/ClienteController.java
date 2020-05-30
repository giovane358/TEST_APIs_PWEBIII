package br.com.test.Clientes.controller;


import br.com.test.Clientes.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping
    public List<Cliente> listarTodos(){

        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("Giovane Santos");
        cliente.setCPF("503.804.468-98");
        cliente.setNascimento(LocalDate.of(2002,9,29));

        Cliente cliente2 = new Cliente();
        cliente2.setId(1L);
        cliente2.setNome("Giovane Santos");
        cliente2.setCPF("503.804.468-98");
        cliente2.setNascimento(LocalDate.of(2002,9,29));

        Cliente cliente3 = new Cliente();
        cliente3.setId(1L);
        cliente3.setNome("Giovane Santos");
        cliente3.setCPF("503.804.468-98");
        cliente3.setNascimento(LocalDate.of(2002,9,29));

        List<Cliente> Resultado = Arrays.asList(cliente,cliente2,cliente3);

        return Resultado;

    }

    @PostMapping
    public Cliente listarUm(){
        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("Giovane Santos");
        cliente.setCPF("503.804.468-98");
        cliente.setNascimento(LocalDate.of(2002,9,29));

        return cliente;
    }
}
