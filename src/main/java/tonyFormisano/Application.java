package tonyFormisano;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import tonyFormisano.EventoDAO.EventDAO;
import tonyFormisano.entities.Evento;
import tonyFormisano.exceptions.NotFoundException;

public class Application {

    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("u4d12pu");
    // Per connettersi al DB, dobbiamo sfruttare la Persistence Unit descritta nel file persistence.xml e chiamata u4d12pu
    // Per farlo dobbiamo creare un attributo statico di tipo EntityManagerFactory passandogli il nome della PU

    public static void main(String[] args) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EventDAO eventDAO = new EventDAO(entityManager);

        try {
            Evento found = eventDAO.trovaEventoByID(5);
            System.out.println(found);
        } catch (NotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            eventDAO.eliminaEvento(2);
        } catch (NotFoundException ex) {
            System.out.println(ex.getMessage());
        }


    }
}