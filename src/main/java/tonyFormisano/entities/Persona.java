package tonyFormisano.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="Nome")
    private String nome;
    @Column(name="Cognome")
    private String cognome;
    @Column(name="Email")
    private String email;
    @Column(name="Nascita")
    private String nascita;
    @Column(name="Sesso")
    @Enumerated(EnumType.STRING)
    private Sesso sesso ;
//    da inserire LISTA PARTECIPAZIONI
@OneToMany(mappedBy = "persona")
@OrderBy("id ASC")
private List<Partecipazione> partecipazioni=new ArrayList<>();


    //    CONSTRUCTOR VUOTO, GETTER E SETTER
    public Persona(){}

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public String getNascita() {
        return nascita;
    }

    public Sesso getSesso() {
        return sesso;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNascita(String nascita) {
        this.nascita = nascita;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }
}
