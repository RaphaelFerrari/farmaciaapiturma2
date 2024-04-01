package br.com.alura.farmaciaapiturma2.dto;

import br.com.alura.farmaciaapiturma2.repository.ProdutoRepository;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record DadosCadrastroDTO(
    @NotBlank
    String nomeFabricante,
    @NotBlank
    String nomeProduto,
    @NotBlank
    String descricaoProduto,
    @Positive
    double precoProduto
            ){
}
