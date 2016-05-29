package repositorios;

import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import modelos.Pessoa;

/**
 *
 * @author Thiago
 */
public class RepositorioPessoa {
    @Inject
    private EntityManager entityManager;
    
    public void inserir(Pessoa amigo) {
		entityManager.persist(amigo);
	}
	
	public List<Pessoa> todasPessoas(){
		return entityManager.createQuery("select p from " + Pessoa.class.getSimpleName() + " p").getResultList();
	}
	
	public void remover(Pessoa amigo){
		entityManager.remove(entityManager.merge(amigo));
	}
	
	public void removerPorId(Integer id){
		Pessoa entidade = entityManager.find(Pessoa.class, id);
		entityManager.remove(entidade);
	}
	
	public void atualizar(Pessoa amigo){
		entityManager.merge(amigo);
	}
	
	public Pessoa pesquisarPorId(Integer id){
		return entityManager.find(Pessoa.class, id);
	}
	
	public Pessoa pesquisarPorCpf(String cpf){
		String sql = "select p from "+ Pessoa.class.getSimpleName() + " p where p.cpf = '"+ cpf +"'";
		List resultList = entityManager.createQuery(sql).getResultList();
		return ((resultList != null && !resultList.isEmpty() )? ((Pessoa) resultList.get(0)) : null);
	}

	public boolean existePessoaComCpf(String cpf) {
		String sql = "select count(1) from " + Pessoa.class.getSimpleName() + " p where p.cpf = '" + cpf + "'";
		long quantidade = (long) entityManager.createQuery(sql).getSingleResult();
		return (quantidade > 0);
	}
    
}
