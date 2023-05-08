class Media {
    private String title;
    private int year;

    public Media(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Year: " + this.year);
    }
    public static void main(String[] args) {
        Movie movie = new Movie("The Big Lebowski", 1998, "Ethan Coen");
        movie.displayDetails();
    }
}

class Movie extends Media {
    private String director;

    public Movie(String title, int year, String director) {
        super(title, year);
        this.director = director;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Director: " + this.director);
    }    
}
