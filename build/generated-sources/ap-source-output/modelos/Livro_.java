package modelos;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Livro.class)
public abstract class Livro_ {

	public static volatile SingularAttribute<Livro, String> sinopse;
	public static volatile SingularAttribute<Livro, String> titulo;
	public static volatile SingularAttribute<Livro, LocalDate> aquisicao;
	public static volatile SingularAttribute<Livro, Integer> id;
	public static volatile SingularAttribute<Livro, Boolean> emprestado;
	public static volatile SingularAttribute<Livro, String> autor;

}

