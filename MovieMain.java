package practice1;

import java.util.ArrayList;

public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	MovieData mov = new MovieData();
    	
    	ArrayList<Movie> al = new ArrayList<>();
		
    	al = mov.addMovie();
    	
    	mov.category(al);
    	System.out.println("---------Updated Movie Categories----------------");
    	mov.displayMovie(al);
    	
    	mov.sortMovie(al);
    	System.out.println("---------Movie Sorted by Rating----------------");
    	mov.displayMovie(al);
    	
    	
    	
    	mov.removeMovie(al);
    	System.out.println("---------Movie Removed(Less than rating 5)----------------");
    	mov.displayMovie(al);


	}

}
