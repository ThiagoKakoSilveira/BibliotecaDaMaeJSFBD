package managedBeans;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
//import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import modelos.Livro;
import repositorios.RepositorioLivro;

/**
 *
 * @author Thiago
 */
@Named(value = "livroMb")
@RequestScoped
public class LivroMb implements Serializable{

    private Livro livro;
    private RepositorioLivro repositorio;

    public LivroMb() {
        repositorio = new RepositorioLivro();
        livro = new Livro();
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public RepositorioLivro getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(RepositorioLivro repositorio) {
        this.repositorio = repositorio;
    }
    
    public void salvar(){
        repositorio.inserir(getLivro());
        limpar();
    }

    public void limpar() {
        setLivro(new Livro());
    }
    
    public void deletarLivro(){
        repositorio.remover(getLivro());
    }

}
