
    import java.util.Objects;


    public class Movie {


        String title;
        int year;
        String genre;
        int rating;


        public Movie(String title, int year, String genre, int rating) {
            this.title = title;
            this.year = year;
            this.genre = genre;
            this.rating = rating;
        }


        public int getYear() {
            return year;
        }


        public void setYear(int year) {
            this.year = year;
        }


        public String getTitle() {
            return title;
        }


        public void setTitle(String title) {
            this.title = title;
        }


        public String getGenre() {
            return genre;
        }


        public void setGenre(String genre) {
            this.genre = genre;
        }


        public int getRating() {
            return rating;
        }


        public void setRating(int rating) {
            this.rating = rating;
        }




        @Override
        public String toString() {
            return "Movie{" +
                    "title='" + title + '\'' +
                    ", year=" + year +
                    ", genre='" + genre + '\'' +
                    ", rating=" + rating +
                    '}';
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Movie movie = (Movie) o;
            return Objects.equals(title, movie.title);
        }


        @Override
        public int hashCode() {
            return Objects.hash(title);
        }
    }
