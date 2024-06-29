package br.com.medi.api.topico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosTopicos (@NotBlank
                            Integer id,
                            @NotBlank
                            String titulo,
                            @NotNull
                            Tema tema,
                            @NotBlank
                            String mensagem,
                            @NotBlank
                            String nomeAutor,
                            @NotNull
                                    @Valid
                            DadosResposta resposta
                            ){

}
