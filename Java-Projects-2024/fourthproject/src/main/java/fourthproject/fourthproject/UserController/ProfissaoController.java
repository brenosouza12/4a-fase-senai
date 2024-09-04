package fourthproject.fourthproject.UserController;

import fourthproject.fourthproject.model.Profissao;
import fourthproject.fourthproject.repository.ProfissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profissoes")

public class ProfissaoController {

    @Autowired
    private ProfissaoRepository profissaoRepository;

    @GetMapping
    public Profissao createProfissao(@RequestBody Profissao profissao) {
        return profissaoRepository.save(profissao);
    }

}
