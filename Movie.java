package practice1;

public class Movie {
	String movieName;
	String director;
	double rating;
	int duration;
	String category = null;
	public Movie(String movieName, String director, double rating, int duration) {
		this.movieName = movieName;
		this.director = director;
		this.rating = rating;
		this.duration = duration;
	}

	void displayMovie() {
		System.out.println("Movie Name: " +movieName);
		System.out.println("Movie Director: " +director);
		System.out.println("Movie Rating: " +rating);
		System.out.println("Movie Duration: " +duration+"mins");
		System.out.println("Category: " +category);
		System.out.println("-----------------------------------------------");
		
	}
}
