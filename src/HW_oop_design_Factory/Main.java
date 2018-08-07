package HW_oop_design_Factory;

/*
Task 3
implement Factory method for different Manga class
keys: One Piece, Gintama, Barakamon, Shingeki no Kyojin, Haikyuu!!
*/


public class Main {
    public static void main(String args[]){
        Manga [] myManga = new Manga[5];
        myManga[0] = MangaFactory.createManga("One Piece");
        myManga[1] = MangaFactory.createManga("Barakamon");
        myManga[2] = MangaFactory.createManga("Shingeki no Kyojin");
        myManga[3] = MangaFactory.createManga("Haikyuu!!");
        myManga[4] = MangaFactory.createManga("Gintama");

        for (int i = 0; i < myManga.length; i++){
            myManga[i].printInfo();
        }
    }
}
