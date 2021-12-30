package test;

public class MovieService {

    public String action = "Action";
    public String horror = "Horror";
    public String comedy = "Comedy";

    public Movie MoviePriceChange(Movie movie){
        System.out.println(movie);
        Movie movie_1 = new Movie();
        movie_1.setId(movie.getId());
        movie_1.setTitle(movie.getTitle());
        movie_1.setGenre(movie.getGenre());
        movie_1.setLength(movie.getLength());
        movie_1.setDirector(movie.getDirector());
        movie_1.setSynopsis(movie.getSynopsis());
        movie_1.setPrice(movie.getPrice() + 2.5);
        return movie_1;
    }

    public Movie HorrorMovie(Movie movie){
        System.out.println(movie);
        Movie horror_movie = new Movie();
        if (movie.getGenre().equals(horror)) {
            horror_movie.setId(movie.getId());
            horror_movie.setTitle(movie.getTitle());
            horror_movie.setGenre(movie.getGenre());
            horror_movie.setLength(movie.getLength());
            horror_movie.setDirector(movie.getDirector());
            horror_movie.setSynopsis(movie.getSynopsis());
            horror_movie.setPrice(movie.getPrice());
            return horror_movie;
        } else {
            return null;
        }
    }

    public Movie ComedyMovie(Movie movie){
        System.out.println(movie);
        Movie comedy_movie = new Movie();
        if (movie.getGenre().equals(comedy)) {
            comedy_movie.setId(movie.getId());
            comedy_movie.setTitle(movie.getTitle());
            comedy_movie.setGenre(movie.getGenre());
            comedy_movie.setLength(movie.getLength());
            comedy_movie.setDirector(movie.getDirector());
            comedy_movie.setSynopsis(movie.getSynopsis());
            comedy_movie.setPrice(movie.getPrice());
            return comedy_movie;
        } else {
            return null;
        }
    }

    public Movie ActionMovie(Movie movie){
        System.out.println(movie);
        Movie action_movie = new Movie();
        if (movie.getGenre().equals(action)) {
            action_movie.setId(movie.getId());
            action_movie.setTitle(movie.getTitle());
            action_movie.setGenre(movie.getGenre());
            action_movie.setLength(movie.getLength());
            action_movie.setDirector(movie.getDirector());
            action_movie.setSynopsis(movie.getSynopsis());
            action_movie.setPrice(movie.getPrice());
            return action_movie;
        } else {
            return null;
        }
    }



}
