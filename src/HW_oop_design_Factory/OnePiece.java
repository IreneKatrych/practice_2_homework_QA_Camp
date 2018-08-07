package HW_oop_design_Factory;

/*
Task 3
implement Factory method for different Manga class
keys: One Piece, Gintama, Barakamon, Shingeki no Kyojin, Haikyuu!!
*/


public class OnePiece extends Manga {

    public String name = "One Piece";
    public OnePiece(float price, boolean isForAdult) {
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
