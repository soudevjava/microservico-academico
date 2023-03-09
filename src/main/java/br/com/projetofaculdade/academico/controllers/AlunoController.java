package br.com.projetofaculdade.academico.controllers;

import br.com.projetofaculdade.academico.dtos.AlunoDto;
import br.com.projetofaculdade.academico.services.AlunoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.UUID;


@RestController
@RequestMapping("/academico/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping("/{id}")
    public ResponseEntity<AlunoDto> buscarAlunoPorId(@PathVariable @NotNull UUID id){
        AlunoDto dto = alunoService.buscarAlunoPorId(id);

        return ResponseEntity.ok(dto);
    }
}
