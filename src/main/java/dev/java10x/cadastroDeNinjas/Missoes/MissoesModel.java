package dev.java10x.cadastroDeNinjas.Missoes;


import dev.java10x.cadastroDeNinjas.Ninjas.Controller.Service.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descrição;
    private String dificuldade;
    private NinjaModel ninja;

    public MissoesModel() {
    }

    public MissoesModel(Long id, String descrição, String dificuldade) {
        this.id = id;
        this.descrição = descrição;
        this.dificuldade = dificuldade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}
