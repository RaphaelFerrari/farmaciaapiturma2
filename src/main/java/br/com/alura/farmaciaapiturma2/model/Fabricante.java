package br.com.alura.farmaciaapiturma2.model;

import br.com.alura.farmaciaapiturma2.dto.DadosCadastroDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="fabricantes")
@Entity(name="Fabricante")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Fabricante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    public Fabricante(DadosCadadrastroDTO dadosCadastro) {
        this.nome =dadosCadastro.nomeFabricante();
    }

    public Produto Fabricante() {
        return null;
    }
}

