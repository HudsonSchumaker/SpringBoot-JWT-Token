package br.com.schumaker.forum.modelo.specification;

import java.time.LocalDate;
import org.springframework.data.jpa.domain.Specification;
import br.com.schumaker.forum.modelo.Curso;

public class CursoSpecification {

	public static Specification<Curso> nome(String nome) {
		return (root, criteriaQuery, criteriaBuilder) -> 
			criteriaBuilder.like(root.get("nome"), "%" + nome + "%");
	}
	
	public static Specification<Curso> categoria(String categoria) {
		return (root, criteriaQuery, criteriaBuilder) -> 
			criteriaBuilder.equal(root.get("categoria"), categoria);
	}
}
