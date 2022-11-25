import java.util.ArrayList;
import java.util.List;

public class MovieType<T> {
    private String typeName;
    private ArrayList<T> movies = new ArrayList<>();

    public MovieType(String typeName) {
        this.typeName = typeName;
    }
    public boolean addMoviesType(T movie){
        if(movies.contains(movie)){
            System.out.println(((Movie)movie).getName() + " is already on the list");
            return false;
        }else{
            movies.add(movie);
            return true;
        }
    }
    public void printMovies(){
        System.out.println("All movies for movie type: " + this.typeName);
        for(int i = 0; i< movies.size();i++){
            System.out.println(i + 1 + ": " + movies.get(i));
        }
        System.out.println();
    }
}
