package practice1;

public class Movies {
	String movieName;
	String director;
	double rating;
	int duration;
	String category = null;
	public Movies(String movieName, String director, double rating, int duration) {
		this.movieName = movieName;
		this.director = director;
		this.rating = rating;
		this.duration = duration;
	}
	
	void displayMovies() {
		System.out.println("Movies Name: "+movieName);
		System.out.println("Movies director: "+director);
		System.out.println("Movies rating: "+rating);
		System.out.println("Movies duration: "+duration);
		System.out.println("Movies category: "+category);
		System.out.println("-------------------------------");
	}
	
}
