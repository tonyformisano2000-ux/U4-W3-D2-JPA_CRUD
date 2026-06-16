package tonyFormisano.entities;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity

@Table (name="Events")
public class Evento{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="eventID")
    private long id;

    @Column (name="title", nullable = false)
    private String title;

    @Column (name="dateEvent")
    private LocalDate dateEvent;

@Column (name="description", nullable = false)
    private String description;

@Column (name = "eventType", nullable = false)
    @Enumerated(EnumType.STRING)
    private EventType eventType;

@Column (name="maxSeats", nullable = false)
    private int maxSeats;

public Evento (){}


// GETTER

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDateEvent() {
        return dateEvent;
    }

    public String getDescription() {
        return description;
    }

    public EventType getEventType() {
        return eventType;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

//   SETTER

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDateEvent(LocalDate dateEvent) {
        this.dateEvent = dateEvent;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }
}
