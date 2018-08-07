package HW_oop_design_Singleton;

/*
task 2
Implement Singleton for email sending service
*/


public class Main {

    public static void main(String args[]){

        EmailSingleton.getInstance().sendMessage("example@mail.com");
        EmailSingleton.getInstance().sendMessage("bla@mail.com");
    }
}
