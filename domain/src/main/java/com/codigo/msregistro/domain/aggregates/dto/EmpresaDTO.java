package com.codigo.msregistro.domain.aggregates.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmpresaDTO {
    private Long idEmpresa;
    private String numeroDocumento;
    private String razonSocial;
    private String nombreComercial;
    private Integer estado;
    private String usuarioCrea;
    private Timestamp fechaCreacion;
    private String usuarioModifica;
    private Timestamp fechaModificacion;
    private String usuarioElimina;
    private Timestamp fechaEliminacion;
}
