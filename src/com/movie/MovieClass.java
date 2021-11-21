package com.movie;

public class MovieClass {
    private final String title;
    private final String studio;
    private final String rating;

    public MovieClass(String title,String studio,String rating) {
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }

    public MovieClass(String title,String studio) {
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }

    public static MovieClass[] ratePG(MovieClass[] movie) {
        MovieClass[] MovieWithPGRating=new MovieClass[movie.length];
        int index=0;
        for (MovieClass movieClass : movie) {
            if (movieClass.rating.equals("PG")) {
                MovieWithPGRating[index] = movieClass;
                index++;
            }
        }
     return MovieWithPGRating;
    }

    public static void main(String[] args) {
	// write your code here
        MovieClass movieCons1= new MovieClass("ABC","XYZ");

        MovieClass[] movie=new MovieClass[4];
        movie[0]=new MovieClass("ABC","XYZ","AG");
        movie[1]=new MovieClass("ABED","XYZ1","AG");
        movie[2]=new MovieClass("ABIDE","XYZ2","PG");
        movie[3]=new MovieClass("ABIDE","XYZ3","PG");

        MovieClass[] MoviesWithRatingPG=MovieClass.ratePG(movie);
        System.out.println("Movies With Rating PG: ");
        for (MovieClass movieClass : MoviesWithRatingPG) {
            System.out.println(movieClass.title + " " + movieClass.studio + " " + " " + movieClass.rating);
        }

        MovieClass movieCons2=new MovieClass("Casino Royale","Eon Productions"," PG-13");
    }
}
