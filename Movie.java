import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private String startTime;
    private String howLong;
    List<Movie> horrorList;

    public Movie(String name, String startTime, String howLong) {
        this.name = name;
        this.startTime = startTime;
        this.howLong = howLong;
        this.horrorList = new ArrayList<>();
    }
    //Getters
    public String getName() {
        return name;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getHowLong() {
        return howLong;
    }
    public String toString() {
        return (name + "\nStarts at: " + startTime + "\nLasts: " + howLong);
    }
}
