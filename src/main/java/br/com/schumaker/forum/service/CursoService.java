package br.com.schumaker.forum.service;

import java.util.List;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import br.com.schumaker.forum.repository.CursoRepository;

@Service
public class CursoService() {

  public List<Curso> getBy(ReportDTO dto) {
    List<Funcionario> cursos = cursoRepository
	    .findAll(Specification
	    .where(CursoSpecification.nome(dto.getNome))
	    .or(CursoSpecification.categoria(dto.getCategoria)));
    return cursos;
  }
}
