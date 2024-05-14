
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {


        ArrayList<Movie> movies = new ArrayList<>();
        System.out.println(movies.isEmpty());
        System.out.println(movies.size());


        movies.add(new Movie ("Snowden", 2024, "Fiction", 1));
        movies.add(new Movie ("Kings", 2022, "Science", 2));
        movies.add(new Movie ("Privacy", 2020, "Fiction", 3));


        System.out.println(movies.size());


        //removal
        for (Movie movie: movies) {
            System.out.println(movie);
        }
        movies.remove(new Movie ("Kings", 2022, "Science", 4));


        //for incrementing rating
        movies.set(0,new Movie("zero Movie", 2019, "Factual", 5));
        // System.out.println();
        for(Movie movie: movies){
            System.out.println(movie);
        }


        //incrementing
        for(Movie movie: movies){
            movie.setRating(movie.getRating()+1);
        }




        System.out.println("\nRatings after increment:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }


}



