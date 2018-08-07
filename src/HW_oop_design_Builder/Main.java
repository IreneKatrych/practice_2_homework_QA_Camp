package HW_oop_design_Builder;

/*
task1
implement Builder to Email object
*/

public class Main {

    public  static  void  main(String args[]){

        MailBuilder newEmail = new MailBuilder("somebody@mail.com","courses");
        newEmail.setBody("Something about courses");
        newEmail.setPriority(4);
        System.out.println("Email: " + newEmail.getTo());
        System.out.println("Subject: " + newEmail.getSubject());
        System.out.println("Text: " + newEmail.getBody());
        System.out.println("Attachment: " + newEmail.isAttachment());
        System.out.println("Priority: " + newEmail.getPriority());

        System.out.println("New object: ");
        MailBuilder secondEmail = new MailBuilder("who@mail.ua","smth");
        secondEmail.createMail();
        System.out.println(secondEmail.getTo());
        System.out.println(secondEmail.getSubject());
        secondEmail.setBody("smth new");
        System.out.println(secondEmail.getBody());

    }
}
