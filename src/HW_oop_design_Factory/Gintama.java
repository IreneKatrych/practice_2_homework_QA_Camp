package HW_oop_design_Factory;

/*
Task 3
implement Factory method for different Manga class
keys: One Piece, Gintama, Barakamon, Shingeki no Kyojin, Haikyuu!!
*/


public class Gintama extends Manga {

    public String name = "Gintama";
    public Gintama(float price, boolean isForAdult) {
        super(price, isForAdult);
    }

    @Override
    public void printInfo(){
        if(isForAdult==true){
            System.out.println("Name: '"+ name + "' Price: "+ price + " For adults");}
        else {
            System.out.println("Name: '" + name + "' Price: "+ price + " For children");
        }
    }
}
