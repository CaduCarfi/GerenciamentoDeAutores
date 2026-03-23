package Gerenciamento.de.Autores.ex4.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "Autor")
@Table(name = "tb_autor")
public class AutoresModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nomeAutor")
    private String nome;
    @Column(name = "nacionalidadeAutor")
    private String nacionalidade;
    private LocalDate anoNascimento;

    public AutoresModel() {
    }

    public AutoresModel(Long id, String nome, String nacionalidade, LocalDate anoNascimento) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.anoNascimento = anoNascimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public LocalDate getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(LocalDate anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}
