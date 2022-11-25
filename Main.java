import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cinema Liverpool = new Cinema("L3 9BY");
        MovieType<Horror> Horrors = new MovieType<Horror>("Horrors");
        MovieType<Comedy> Comedies = new MovieType<Comedy>("Comedy");
        MovieType<Fantasy> Fantasy = new MovieType<Fantasy>("Fantasy");

        //Horrors
        Horror annabell2 = new Horror("Annabell 2" , "20:30", "1h : 27min (87minutes)");
        Horror hallowen_2022 = new Horror("Halloween Kills" , "22:30", "1h : 30min (90minutes)");
        Horror alien3 = new Horror("Alien: Isolation" , "20:30", "1h : 27min (87minutes)");
        Horror nope = new Horror("Nope" , "22:30", "1h : 30min (90minutes)");
        //horror list
        Horrors.addMoviesType(hallowen_2022);
        Horrors.addMoviesType(annabell2);
        Horrors.addMoviesType(alien3);
        Horrors.addMoviesType(nope);

        //Comedies list
        Comedy freeGuy = new Comedy("Free Guy" , "21:15", "1h : 30min (90 minutes)");
        Comedy dog = new Comedy("Dog" , "16:00", "2h (120 minutes)");
        Comedy ocena8 = new Comedy("Ocean's 8" , "15:30", "1h : 47min (107 minutes)");
        Comedy minions = new Comedy("Minions" , "13:30", "1h : 10min (70 minutes)");
        Comedy jumanji = new Comedy("Jumanji 2019" , "21:30", "1h : 30min (90 minutes)");
        //Added comedies
        Comedies.addMoviesType(freeGuy);
        Comedies.addMoviesType(minions);
        Comedies.addMoviesType(dog);
        Comedies.addMoviesType(ocena8);
        Comedies.addMoviesType(jumanji);

        Fantasy fantastic_beasts = new Fantasy("Fantastic Beasts and Where to Find them" , "16:00", "1h : 57min (117 minutes)");
        Fantasy warcraft = new Fantasy("Warcraft: Beginning" , "20:00", "1h : 27min (87 minutes)");
        Fantasy avengers_endgame = new Fantasy("Avengers: Endgame" , "19:30", "2h : 30min (150 minutes)");
        Fantasy van_helsing = new Fantasy("Ven Helsing: Vampire Hunter" , "22:30", "1h : 13min (73 minutes)");
        //Fantasy list
        Fantasy.addMoviesType(fantastic_beasts);
        Fantasy.addMoviesType(warcraft);
        Fantasy.addMoviesType(avengers_endgame);
        Fantasy.addMoviesType(van_helsing);


    }
}
