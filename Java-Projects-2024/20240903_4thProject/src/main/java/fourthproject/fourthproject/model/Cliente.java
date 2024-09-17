package fourthproject.fourthproject.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 60)
    @NotNull
    private String nome;

    @Column(nullable = false, unique = true, length = 11)
    @NotNull
    @Size(min = 11, max = 11)
    private String cpf;

    @Column(name = "data_nascimento", nullable = false)
    @NotNull
    private LocalDate dataNascimento;

    @Column(name = "fk_id_profissao", nullable = false)
    @NotNull
    private int fk_id_profissao;

    // Construtor vazio
    public Cliente() {
    }

    // Construtor com parâmetros
    public Cliente(String nome, String cpf, LocalDate dataNascimento, int fk_id_profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.fk_id_profissao = fk_id_profissao;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getFk_id_profissao() {
        return fk_id_profissao;
    }

    public void setFk_id_profissao(int fk_id_profissao) {
        this.fk_id_profissao = fk_id_profissao;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", fk_id_profissao=" + fk_id_profissao +
                '}';
    }
}
