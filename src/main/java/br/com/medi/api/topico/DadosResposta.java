package br.com.medi.api.topico;

import jakarta.validation.constraints.NotBlank;

public record  DadosResposta(
        @NotBlank
        String resposta) {

}
