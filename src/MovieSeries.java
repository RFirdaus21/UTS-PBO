import java.util.Scanner;
import Other.*;
class Movie {
    private String title;
    private String director;
    private int year;
    
    Scanner input = new Scanner(System.in);
    String inputUser;

    threadSleep sleep = new threadSleep();
    Cls cls = new Cls();

    boolean condition;

     void setTitle(String title){
        this.title = title;
    }
     String getTitle(){
        return this.title;
    }
     void setDirector (String director){
        this.director = director;
    }
     String getDirector (){
        return this.director;
    }
     void setYear(int year){
        this.year = year;
    }
     int getYear(){
        return this.year;
    }

    private String genre;
     private String cast;

     void setGenre(String genre){

         this.genre = genre;
        }
        String getGenre(){

         return this.genre;
        }
        void setCast(String cast){

         this.cast = cast;
        }
        String getCast(){

         return this.cast;
        }
        void showMovieinList(){

         System.out.println(" "+this.getTitle()+"    ("+this.getYear()+")");
        }

        void ShowDetails () {
            while (!condition) {
                System.out.println("\nMOVIE DETAILS\n");
                System.out.println("Title : " + this.getTitle());
                System.out.println("Director : " + this.getDirector());
                System.out.println("Year : " + this.getYear());
                System.out.println("Genre : " + this.getGenre());
                System.out.println("Cast : " + this.getCast());
                System.out.print("\n\nKetik apapun kemudian enter untuk kembali ke menu utama");
                inputUser = input.next();
                if (inputUser.equals("")) {
                    sleep.delay500();
                    cls.clearscreen();
                    condition = true;
                }
                cls.clearscreen();
                break;
            }
        }
}

/*inheritance */
class SeriesDetails extends Movie{
    private int season, eps;
    private String cast, genre;

     void setSeason(int season){

         this.season = season;
    }
     int getSeason(){

         return this.season;
    }
     void setEps(int eps){

         this.eps = eps;
    }
     int getEps(){

         return this.eps;
    }
     void setGenre(String genre){

         this.genre = genre;
    }
     String getGenre(){

         return this.genre;
    }
     void setCast(String cast){

         this.cast = cast;
    }
     String getCast(){

         return this.cast;
    }

    void showSeriesinList(){

         System.out.println(" "+this.getTitle()+"    ("+this.getYear()+")");
    }

    void ShowDetails () {
        while (!condition) {
        System.out.println("\nSERIES DETAILS\n");
        System.out.println("Title : " + this.getTitle());
        System.out.println("Director : " + this.getDirector());
        System.out.println("Year : " + this.getYear());
        System.out.println("Seasons : " + this.getSeason());
        System.out.println("Episodes : " + this.getEps());
        System.out.println("Genre : " + this.getGenre());
        System.out.println("Cast : " + this.getCast());
        System.out.print("\n\nKetik apapun kemudian enter untuk kembali ke menu utama");
        inputUser = input.next();
            if (inputUser.equals("")) {
            sleep.delay500();
            cls.clearscreen();
            condition = false;
            }
            cls.clearscreen();
            break;
        }
    }
}

/*memberi nilai pada atribut film dengan array*/
class MovieInitiate  {
    public Movie[] seedMovies(){
    Movie[] movies = new Movie[10];

    movies[0] = new Movie();
    movies[0].setTitle("The Godfather I");
    movies[0].setDirector("Francis Ford");
    movies[0].setYear(1985);
    movies[0].setGenre("Action, Crime");
    movies[0].setCast("Al Pacino, Marlon Brando, James Caan, Diane Keaton");

    movies[1] = new Movie();
    movies[1].setTitle("Harry Potter and the Prisoner of Azkaban"); 
    movies[1].setDirector("David Yates");
    movies[1].setYear(1998);
    movies[1].setGenre("Action, Supranatural, Fantasy");
    movies[1].setCast("Daniel Radcliffe, Emma Watson");

    movies[2] = new Movie();
    movies[2].setTitle("Avengers Infinity War"); 
    movies[2].setDirector("Anthony Russo & Joe Russo");
    movies[2].setYear(2018);
    movies[2].setGenre("Action, Adventure, Sci-Fi");
    movies[2].setCast("Robert Downey Jr, Chris Hemsworth, Mark Ruffalo, Scarlett Johansson");

    return movies;
    }
}
/*memberi nilai pada atribut series */
class SeriesInitiate {
public SeriesDetails[] seedSeries(){
    SeriesDetails[] series = new SeriesDetails[10];

    series[0] = new SeriesDetails();
    series[0].setTitle("Narcos");
    series[0].setDirector("Chris Brancato, Carlo Bernard, and Doug Miro");
    series[0].setYear(2017);
    series[0].setEps(30);
    series[0].setSeason(3);
    series[0].setGenre("Crime, Action");
    series[0].setCast("Wagner Moura, Pedro Pascal, Boyd Hoolbrook");

    series[1] = new SeriesDetails();
    series[1].setTitle("The Umbrella Academy");
    series[1].setDirector("Steven Blackman");
    series[1].setYear(2019);
    series[1].setEps(30);
    series[1].setSeason(3);
    series[1].setGenre("Action, Fantasy, Supranatural");
    series[1].setCast("Aidan Gallagher, Elliot Page, Tom Hooper");

    return series;
}
}

