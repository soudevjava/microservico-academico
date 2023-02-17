package br.com.projetofaculdade.academico.controllers;

import br.com.projetofaculdade.academico.services.AlunoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/academico/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;
}
