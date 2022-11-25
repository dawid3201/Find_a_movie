import java.util.*;

public class Cinema {
    private String location;
    private List<Movie> movies;


    public Cinema(String location) {
        this.location = location;
        this.movies = new ArrayList<>();
    }

    public boolean addMovie(Movie movie){
        if(this.movies.contains(movie)){
            return false;
        }else{
            this.movies.add(movie);
            return true;
        }
    }
    public void printMovies(){
        for(int i = 0; i< this.movies.size();i++){
            System.out.println(i + 1 + ": " + this.movies.get(i));
        }
    }
    private Movie findMovie(String title){
        //Use for loop in order to go through every element of the list
        for(Movie checkedSong : this.movies){
            if(checkedSong.getName().equals(title)){
                System.out.println("The movie " + checkedSong + " was found on the list.");
                return checkedSong;
            }
        }
        System.out.println("The movie " + title + " was not found.");
        return null;
    }
}
