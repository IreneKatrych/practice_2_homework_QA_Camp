package HW_oop_design_Builder;

/*
task1
implement Builder to Email object
*/

public class Mail  {

    private String to;
    private String subject;

    Mail(String to,
         String subject) {
        this.to=to;
        this.subject=subject;
    }


    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
