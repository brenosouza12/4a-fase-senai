package fourthproject.fourthproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Profissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfissao;

    private String nome;

    public Profissao() {
    }

    public Profissao(String nome) {
        this.nome = nome;
    }

    public int getIdProfissao() {
        return idProfissao;
    }

    public void setIdProfissao(int idProfissao) {
        this.idProfissao = idProfissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}