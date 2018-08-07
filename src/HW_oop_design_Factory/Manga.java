package HW_oop_design_Factory;

/*
Task 3
implement Factory method for different Manga class
keys: One Piece, Gintama, Barakamon, Shingeki no Kyojin, Haikyuu!!
*/

public abstract class Manga {
    public float price;
    public boolean isForAdult;

    public Manga(float price, boolean isForAdult) {
        this.price = price;
        this.isForAdult = isForAdult;
    }

    public void printInfo(){
        if(isForAdult==true){
        System.out.println("Name: " + "Price: "+ price + "For adults");}
        else {
            System.out.println("Name: " + "Price: "+ price + "For children");
        }
    }
}
