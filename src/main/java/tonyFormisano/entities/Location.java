package tonyFormisano.entities;

import jakarta.persistence.*;

@Entity
@Table(name ="location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nome")
    private String nome;
    @Column(name="Città")
    private String città;



//    CONSTRUCTOR VUOTO, GETTER E SETTER
    public Location(){}

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCittà() {
        return città;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCittà(String città) {
        this.città = città;
    }
}
