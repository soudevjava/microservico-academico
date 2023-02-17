package br.com.projetofaculdade.academico.repositories;

import br.com.projetofaculdade.academico.model.enums.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AlunoRepository  extends JpaRepository<Aluno, UUID> {


}
