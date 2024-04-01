package br.com.alura.farmaciaapiturma2.model;

import br.com.alura.farmaciaapiturma2.dto.DadosCadastroDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.core.SpringVersion;

@Table(name="produtos")
@Entity(name="Produto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Produto {
    public Fabricante get;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    @ManyToOne
    private Fabricante fabricante;


    public Produto(DadosCadastroDTO dadosCadastro, Fabricante fabricante) {
        this.nome = dadosCadastro.nomeProduto();
        this.descricao = dadosCadastro.descricaoProduto();
        this.preco = dadosCadastro.precoProduto();
        this.fabricante = fabricante;
    }

    public Object getID() {
        return null;
    }

    public long getId() {
        return 0;
    }

    public Object getPreco() {
        return null;
    }

    public Object getNome() {
        return null;
    }

    public Object getDescricao() {
        return null;
    }

    public void setPreco(int preco) {
    }

    public void setDescricao(boolean descricao) {
    }
}

