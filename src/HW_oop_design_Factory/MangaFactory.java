package HW_oop_design_Factory;

/*
Task 3
implement Factory method for different Manga class
keys: One Piece, Gintama, Barakamon, Shingeki no Kyojin, Haikyuu!!
*/


public class MangaFactory {

    public static Manga createManga(String name){
        if(name.equals("One Piece")){return new OnePiece(15.45f, false);}
        else if (name.equals("Gintama")){return new Gintama(18.23f, true);}
        else if (name.equals("Barakamon")){return new Barakamon(22.00f, false);}
        else if (name.equals("Shingeki no Kyojin")) return new Shingeki(30.25f, true);
        else if (name.equals("Haikyuu!!")) return new Haikyuu(18.50f, false);
        else return null;
    }
}
