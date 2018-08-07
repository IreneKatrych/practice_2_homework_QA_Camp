package HomeWork_from_lecture_oop1;

//Task2
// Create class Men and inherit him from Human

public class Men extends Human implements iTalk {

    Men(String name) {
        super(name);
    }

    //Task 5
    // Override method sleep
    @Override
    public void sleep(){
        System.out.println( name + ": I sleep one more time. ");
    }
}
