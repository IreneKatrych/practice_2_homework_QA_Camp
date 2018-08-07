package HW_oop_design_Singleton;

/*
task 2
Implement Singleton for email sending service
*/

public class EmailSingleton {
    private static EmailSingleton ourInstance = new EmailSingleton();

    public static EmailSingleton getInstance() {
        return ourInstance;
    }

    private EmailSingleton() {
    }

    public void sendMessage(String email){
        System.out.println("Your message is sent to " + email);
    }
}
