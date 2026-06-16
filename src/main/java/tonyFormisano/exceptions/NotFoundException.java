package tonyFormisano.exceptions;

public class NotFoundException extends Exception {
    public NotFoundException(long id) {
        super("Elemento con id " + id + " non trovato");
    }
}