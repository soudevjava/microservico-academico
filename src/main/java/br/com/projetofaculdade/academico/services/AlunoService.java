package br.com.projetofaculdade.academico.services;

import br.com.projetofaculdade.academico.dtos.AlunoDto;
import br.com.projetofaculdade.academico.model.enums.Aluno;
import br.com.projetofaculdade.academico.repositories.AlunoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.UUID;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    private ModelMapper modelMapper;

    public AlunoDto buscarAlunoPorId(UUID id) {
        Aluno aluno = alunoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
        AlunoDto dto = modelMapper.map(aluno, AlunoDto.class);
        return dto;
    }
}

