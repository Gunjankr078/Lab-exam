package practice1;

import java.util.ArrayList;

public class MoviesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoviesData m = new MoviesData();
		
		ArrayList <Movies> movie = new ArrayList<>();
		
		movie = m.addMov();
		
		m.category(movie);
		m.displayMoviess(movie);
		
		m.sortMovie(movie);
		System.out.println("----Movie sorted by rating----");
		m.displayMoviess(movie);

		m.removeMov(movie);
		System.out.println("Removed Movie whose rating is less than 5");
		m.displayMoviess(movie);
		
		

	}

}
