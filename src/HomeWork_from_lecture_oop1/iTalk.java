package HomeWork_from_lecture_oop1;

//Task3
//Create interface iTalk with method talk (print I talk)
//and implement this interface in class Men

public interface iTalk {

    default void talk() {
        System.out.println("I talk. ");
    }
}
