package com.projetofinal.ninjatask.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class TarefaDTO {
    @Schema(description = "codigo indentificador da tarefa", example = "1")
    private Integer idTarefa;

    @Schema(description = "nome da tarefa", example = "tarefa de casa")
    private String nome;

    @Schema(description = "status da tarefa", example = "pendente")
    private String status;

    private UsuarioDTO usuario;
}
