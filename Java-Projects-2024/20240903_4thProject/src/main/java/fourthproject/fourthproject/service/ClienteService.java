package fourthproject.fourthproject.service;

import fourthproject.fourthproject.exception.ClienteNotFoundException;
import fourthproject.fourthproject.model.Cliente;
import fourthproject.fourthproject.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public Cliente getClienteById(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new ClienteNotFoundException("Cliente com ID " + id + " não encontrado"));
    }

    @Transactional
    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Transactional
    public Cliente updateCliente(Long id, Cliente updatedCliente) {
        Cliente cliente = getClienteById(id); // Usa o método para verificar a existência
        cliente.setNome(updatedCliente.getNome());
        cliente.setCpf(updatedCliente.getCpf());
        cliente.setDataNascimento(updatedCliente.getDataNascimento());
        cliente.setFk_id_profissao(updatedCliente.getFk_id_profissao());
        return clienteRepository.save(cliente);
    }

    @Transactional
    public boolean deleteCliente(Long id) {
        Cliente cliente = getClienteById(id); // Verifica se existe
        clienteRepository.delete(cliente);
        return true;
    }
}
