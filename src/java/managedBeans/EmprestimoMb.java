package managedBeans;

//import java.util.Date;
import anotacao.JpaDao;
import java.util.List;
import javax.enterprise.context.RequestScoped;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;
import modelos.Emprestimo;
import repositorios.RepositorioEmprestimo;

/**
 *
 * @author Thiago
 */
@Named(value = "emprestimoMb")
@RequestScoped
public class EmprestimoMb {

    private Emprestimo emprestimo;
    private List<Emprestimo> listaDeEmprestimo;     
    private RepositorioEmprestimo repositorioEmprestimo;

    public EmprestimoMb() {
        emprestimo = new Emprestimo();
        repositorioEmprestimo = new RepositorioEmprestimo();
    }

    public void salvar() {
        repositorioEmprestimo.inserir(getEmprestimo());
        limpar();
    }

    public void deletar() {
        repositorioEmprestimo.remover(getEmprestimo());
    }

    public void limpar() {
        setEmprestimo(new Emprestimo());
    }

    public void devolver(Emprestimo emprestimo) {
//        listaDeEmprestimo.devolver(emprestimo);
        limpar();
    }

    public void carregarListaDeEmprestimo() {
        setListaDeEmprestimo(repositorioEmprestimo.todosEmprestimos());
    }

    //GETERS & SETERS
    public Emprestimo getEmprestimo() {
        if (emprestimo == null) {
            limpar();
        }
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public List<Emprestimo> getListaDeEmprestimo() {
        if (listaDeEmprestimo == null) {
            carregarListaDeEmprestimo();
        }
        return listaDeEmprestimo;
    }

    public void setListaDeEmprestimo(List<Emprestimo> listaDeEmprestimo) {
        this.listaDeEmprestimo = listaDeEmprestimo;
    }
}