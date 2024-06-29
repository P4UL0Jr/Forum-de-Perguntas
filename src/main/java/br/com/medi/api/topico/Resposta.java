package br.com.medi.api.topico;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor

public class Resposta {

    private String resposta;

    public Resposta(DadosResposta resposta){
        this.resposta = resposta.resposta();
    }
}
