public class Emprestimo {

    private Livro livro;
    private Membro membro;
    private Date dataEmprestimo;
    private Date dataDevolucao;

public Emprestimo (Livro livro, Membro membro, Date dataEmprestimo, Date dataDevolucao){

   this.livro = livro;
   this.membro = membro;
   this.dataEmprestimo = dataEmprestimo;
   this.dataDevolucao = dataDevolucao;

}

public void registrarEmprestimo(){

    System.out.println("Emprestimo registrado: " + livro.getTitulo() + " para " + membro.getNome());

}

public void registrarDevolucao(){

    System.out.println("Devolução registrada");
    
}
    

}
