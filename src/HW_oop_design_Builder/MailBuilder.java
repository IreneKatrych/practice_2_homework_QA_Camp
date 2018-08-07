package HW_oop_design_Builder;

/*
task1
implement Builder to Email object
*/

public class MailBuilder extends Mail {
    private final String to;
    private final String subject;

    private String cc;
    private String body;
    private int priority;
    private boolean attachment;

    public MailBuilder(String to, String subject) {
        super(to, subject);
        this.to = to;
        this.subject = subject;
    }

   public Mail createMail() {
        return new Mail(to, subject);
    }

    public MailBuilder setCc(String cc) {
        this.cc = cc;
        return this;
    }

    public String getBody() {
        return body;
    }

    public MailBuilder setPriority(int priority) {
        this.priority = priority;
        return this;
    }

    public MailBuilder setAttachment(boolean attachment) {
        this.attachment = attachment;
        return this;
    }

    public MailBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public String getCc() {
        return cc;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isAttachment() {
        return attachment;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

}