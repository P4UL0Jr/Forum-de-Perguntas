package br.com.medi.api.topico;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarTopico (@NotNull
                                    Long id,
                                    String titulo,
                                    String mensagem,
                                    Boolean status){
}
