package fourthproject.fourthproject.repository;

import fourthproject.fourthproject.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
