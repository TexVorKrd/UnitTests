package Seminar4.task5;

public class EmailMessage {
    // Класс EmailMessage.java

    private final String to;
    private final String subject;
    private final String body;

    public EmailMessage(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }
}

