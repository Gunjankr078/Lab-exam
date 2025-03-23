package practice1;

import java.util.ArrayList;

public class MovieData {

	ArrayList<Movie> movie = new ArrayList<>();

	public ArrayList<Movie> addMovie() {
		// TODO Auto-generated method stub
		Movie m1 = new Movie("Bahubali", "SS. Raja Mauli", 4.8, 202);
		Movie m2 = new Movie("Pushpa", "SS. Raja Mauli", 8.8, 148);
		Movie m3 = new Movie("Goolmal", "Rohit Shetty", 9.8, 198);
		Movie m4 = new Movie("Singham", "Rohit Shetty", 5.0, 188);
		Movie m5 = new Movie("Bahubali 2", "SS. Raja Mauli", 9.9, 138);
		
		movie.add(m1);
		movie.add(m2);
		movie.add(m3);
		movie.add(m4);
		movie.add(m5);
		return movie;
	}

	public void displayMovie(ArrayList<Movie> al) {
		// TODO Auto-generated method stub
		for (Movie obj:al) {
			obj.displayMovie();
		}
	}

	public void sortMovie(ArrayList<Movie> al) {
		// TODO Auto-generated method stub
		al.sort((m1, m2) -> Double.compare(m2.rating, m1.rating));
	}

	public void removeMovie(ArrayList<Movie> al) {
		// TODO Auto-generated method stub
		al.removeIf(movie -> movie.rating <= 5);
		}

	public void category(ArrayList<Movie> al) {
		// TODO Auto-generated method stub
		for (Movie obj : al) {
			if(obj.duration > 150) {
				obj.category ="Blockbuster";
			}else {
				obj.category = "Regular";
			}
		}
	}	
	
}
