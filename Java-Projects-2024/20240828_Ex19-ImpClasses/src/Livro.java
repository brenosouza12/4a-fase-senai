public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponibilidade = true;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void emprestar() {
        if (disponibilidade) {
            disponibilidade = false;
            System.out.println(titulo + " foi emprestado.");
        } else {
            System.out.println(titulo + " não está disponível.");
        }
    }

    public void devolver() {
        disponibilidade = true;
        System.out.println(titulo + " foi devolvido.");
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    // Getters e setters omitidos para brevidade
}


