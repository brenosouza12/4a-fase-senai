import java.util.ArrayList;
import java.util.List;

public class Membro {
    private String nome;
    private int id;
    private List<Livro> livrosEmprestados;

    public Membro(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livro.emprestar();
            livrosEmprestados.add(livro);
        } else {
            System.out.println("O livro não está disponível para empréstimo.");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            livro.devolver();
        } else {
            System.out.println("Este livro não foi emprestado por este membro.");
        }
    }

    // Getters e setters omitidos para brevidade
}
