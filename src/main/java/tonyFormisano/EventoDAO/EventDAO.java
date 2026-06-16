package tonyFormisano.EventoDAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import tonyFormisano.entities.Evento;

public class EventDAO {
    private final EntityManager entityManager;

//    creo un constructor inn maniera da non dover creare ad ogni transaction un EntityManager
    public EventDAO(EntityManager em){
        this.entityManager=em;
    }
    public void salvaEvento(Evento nuovoEvento){
        EntityTransaction transaction=this.entityManager.getTransaction();

        transaction.begin();
        this.entityManager.persist(nuovoEvento);
        transaction.commit();

    }
    public Evento trovaEventoByID(long Id){
        Evento eventoInQuestione=this.entityManager.find(Evento.class, Id);
        if (eventoInQuestione==null){
            throw new NotFoundExeption(Id);
            System.out.println("evento non trovato");
        }
    }
    public void eliminaEvento (long Id){
        Evento eventoInQuestione=this.entityManager.find(Evento.class, Id);
        if (eventoInQuestione==null){
            System.out.println("evento non trovato");
        }
        EntityTransaction transaction=this.entityManager.getTransaction();
        transaction.begin();
        this.entityManager.remove(eventoInQuestione);
        transaction.commit();
        System.out.println("evento eliminato");
    }
}
