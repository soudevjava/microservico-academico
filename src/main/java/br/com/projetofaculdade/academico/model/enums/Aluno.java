package br.com.projetofaculdade.academico.model.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "TB_ALUNO")

public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "nome_aluno")
    @NotNull
    private String nome;

    @Column(name = "numero_matricula")
    @NotNull
    private String matricula;

    @Column(name = "cpf")
    @NotNull
    @CPF
    private String cpf;

    @Column(name = "data_nascimento")
    @NotNull
    @Temporal(TemporalType.DATE)
    private LocalDate data_nascimento;

}
