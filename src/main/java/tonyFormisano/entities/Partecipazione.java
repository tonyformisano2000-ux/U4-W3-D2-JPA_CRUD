package tonyFormisano.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "partecipazione")
public class Partecipazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="stato")
    @Enumerated(EnumType.STRING)
    private Stato stato;

//    _______________________________________________________
    @OneToOne
    @JoinColumn(name="Persona_ID")
    private Persona persona;
    @OneToOne
    @JoinColumn(name="Evento_ID")
    private Evento evento;

    @ManyToOne
            @JoinColumn(name="personaTornata_ID")
    private Persona personaTornata;
//___________________________________________________________


    //    CONSTRUCTOR VUOTO, GETTER E SETTER
    public Partecipazione(){}

    public Long getId() {
        return id;
    }

    public Stato getStato() {
        return stato;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }
}
