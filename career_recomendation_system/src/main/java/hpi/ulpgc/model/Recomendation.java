package hpi.ulpgc.model;

public class Recomendation {
    public String message;

    public Recomendation(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Recomendation{" +
                "message='" + message + '\'' +
                '}';
    }
}