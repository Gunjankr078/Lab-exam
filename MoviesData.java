package practice1;

import java.util.ArrayList;

public class MoviesData {
	
	public ArrayList<Movies> addMov() {
		// TODO Auto-generated method stub
		ArrayList <Movies> mov = new ArrayList<>();
		
		Movies m1 = new Movies("Bahubali", "SS. Raja Mauli", 4.8, 202);
		Movies m2 = new Movies("Pushpa", "SS. Raja Mauli", 8.8, 148);
		Movies m3 = new Movies("Goolmal", "Rohit Shetty", 9.8, 198);
		Movies m4 = new Movies("Singham", "Rohit Shetty", 5.0, 188);
		Movies m5 = new Movies("Bahubali 2", "SS. Raja Mauli", 9.9, 138);
		
		mov.add(m1);
		mov.add(m2);
		mov.add(m3);
		mov.add(m4);
		mov.add(m5);
		return mov;
	}

	public void category(ArrayList<Movies> movie) {
		// TODO Auto-generated method stub
		for(Movies obj : movie) {
			if (obj.duration == 150) {
				obj.category = "Blockbuster";
			}
			obj.category = "Regular";
		}
	}

	public void displayMoviess(ArrayList<Movies> movie) {
		// TODO Auto-generated method stub
		for(Movies obj : movie) {
			obj.displayMovies();
		}
	}

	public void sortMovie(ArrayList<Movies> movie) {
		// TODO Auto-generated method stub
		movie.sort((m1, m2) -> Double.compare(m2.rating, m1.rating));
	}

	public void removeMov(ArrayList<Movies> movie) {
		// TODO Auto-generated method stub
		movie.removeIf(mov -> mov.rating <= 5);
	}

	

}