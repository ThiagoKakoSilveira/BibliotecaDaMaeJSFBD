package managedBeans;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import modelos.Pessoa;
import repositorios.RepositorioPessoa;
import javax.inject.Named;

/**
 *
 * @author Thiago
 */
@Named(value = "pessoaMb")
@RequestScoped
public class PessoaMb implements Serializable {

    private Pessoa amigo;
    private RepositorioPessoa repositorio;

    public PessoaMb() {
        repositorio = new RepositorioPessoa();
        amigo = new Pessoa();
    }

    public Pessoa getAmigo() {
        return amigo;
    }

    public void setAmigo(Pessoa amigo) {
        this.amigo = amigo;
    }

    public RepositorioPessoa getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(RepositorioPessoa repositorio) {
        this.repositorio = repositorio;
    }

    public void deletarAmigo(Pessoa amigo) {
        repositorio.remover(amigo);
    }

    public void salvar() {
        repositorio.inserir(getAmigo());
        limpar();
    }

    public void limpar() {
        setAmigo(new Pessoa());
    }
}
