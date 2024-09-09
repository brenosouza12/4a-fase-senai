package fourthproject.fourthproject.service;

import fourthproject.fourthproject.model.Profissao;
import fourthproject.fourthproject.repository.ProfissaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ProfissaoService {
    @Autowired
    private ProfissaoRepository profissaoRepository;

    public List<Profissao> getAllProfissoes() {
        return profissaoRepository.findAll();
    }

    public Profissao getProfissaoById(Long id) {
        Optional<Profissao> profissao = profissaoRepository.findById(id);
        return profissao.orElse(null);
    }

    @Transactional
    public Profissao saveProfissao(Profissao profissao) {
        return profissaoRepository.save(profissao);
    }

    @Transactional
    public Profissao updateProfissao(Long id, Profissao updatedProfissao) {
        Optional<Profissao> existingProfissao = profissaoRepository.findById(id);
        if (existingProfissao.isPresent()) {
            Profissao profissao = existingProfissao.get();
            profissao.setNome(updatedProfissao.getNome());
            return profissaoRepository.save(profissao);
        }
        return null;
    }

    @Transactional
    public boolean deleteProfissao(Long id) {
        Optional<Profissao> existingProfissao = profissaoRepository.findById(id);
        if (existingProfissao.isPresent()) {
            profissaoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}