package tonyFormisano.EventoDAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import tonyFormisano.entities.Evento;
import tonyFormisano.exceptions.NotFoundException;

public class EventDAO {

    private final EntityManager entityManager;
    public EventDAO(EntityManager em){
        this.entityManager=em;
    }

//    SALVA EVENTO
    public void salvaEvento(Evento nuovoEvento){
        EntityTransaction transaction=this.entityManager.getTransaction();
        transaction.begin();
        this.entityManager.persist(nuovoEvento);
        transaction.commit();
    }

//    TROVA EVENTO
    public Evento trovaEventoByID(long Id) throws NotFoundException {
        Evento eventoInQuestione=this.entityManager.find(Evento.class, Id);
        if (eventoInQuestione==null){
            System.out.println("evento non trovato");
            throw new NotFoundException(Id);
        }
        return eventoInQuestione;
    }

//    ELIMINA EVENTO
    public void eliminaEvento (long Id) throws NotFoundException{
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
