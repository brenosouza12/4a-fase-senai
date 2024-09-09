package fourthproject.fourthproject.UserController;

import fourthproject.fourthproject.model.Profissao;
import fourthproject.fourthproject.service.ProfissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/profissoes")
public class ProfissaoController {
    @Autowired
    private ProfissaoService profissaoService;

    @GetMapping
    public List<Profissao> getAllProfissoes() {
        return profissaoService.getAllProfissoes();
    }

    @GetMapping("/{id}")
    public Profissao getProfissaoById(@PathVariable Long id) {
        return profissaoService.getProfissaoById(id);
    }

    @PostMapping
    public Profissao createProfissao(@RequestBody Profissao profissao) {
        return profissaoService.saveProfissao(profissao);
    }

    @PutMapping("/{id}")
    public Profissao updateProfissao(@PathVariable Long id, @RequestBody Profissao profissao) {
        return profissaoService.updateProfissao(id, profissao);
    }

    @DeleteMapping("/{id}")
    public boolean deleteProfissao(@PathVariable Long id) {
        return profissaoService.deleteProfissao(id);
    }
}
