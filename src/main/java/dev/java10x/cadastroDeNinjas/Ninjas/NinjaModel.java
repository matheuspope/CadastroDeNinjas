package dev.java10x.cadastroDeNinjas.Ninjas;

import dev.java10x.cadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Entity ele transforma uma classe em uma entidade do banco de dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;
    // @ManyToOne um ninja tem uma única missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Fereing Key ou chave estranheira
    private MissoesModel missoes;

}
