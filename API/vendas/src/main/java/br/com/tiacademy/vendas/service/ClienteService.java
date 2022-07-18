package br.com.tiacademy.vendas.service;

import br.com.tiacademy.vendas.domain.Cliente;
import br.com.tiacademy.vendas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class ClienteService {

    @Autowired
    public ClienteRepository clienteRepository;

    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    public Cliente porId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente editar(Long id ,Cliente editado) {
        Cliente novoNome = porId(id);

        if (Objects.isNull(novoNome)) {
            throw new RuntimeException("Cliente não encontrado");
        }

        novoNome.setNome(editado.getNome());
        return clienteRepository.save(novoNome);
    }

    public void excluir(Long id) {
        clienteRepository.deleteById(id);
    }
}