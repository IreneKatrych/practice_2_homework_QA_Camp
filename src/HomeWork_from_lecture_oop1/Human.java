package HomeWork_from_lecture_oop1;

//Task1
// Create abstract class Human with variable name
// and method sleep(print I sleep)

public abstract class Human {

    public String name;

    Human(String name) {
        this.name = name;
    }

    public void sleep(){
        System.out.println(name + ":  I sleep ");
    }

}
