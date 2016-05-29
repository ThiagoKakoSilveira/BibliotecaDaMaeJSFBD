package modelos;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Emprestimo.class)
public abstract class Emprestimo_ {

	public static volatile SingularAttribute<Emprestimo, Livro> livro;
	public static volatile SingularAttribute<Emprestimo, LocalDate> dataEmprestimo;
	public static volatile SingularAttribute<Emprestimo, Integer> id;
	public static volatile SingularAttribute<Emprestimo, LocalDate> dataDevolucao;
	public static volatile SingularAttribute<Emprestimo, Pessoa> amigo;
	public static volatile SingularAttribute<Emprestimo, Boolean> emprestimoAtivo;

}

