package guessMovie;

import java.io.*;
import java.util.*;

public class MovieList {
	
	 private ArrayList<String> movies;
	  //Constructor
	  public MovieList(String pathname) {
	    movies = new ArrayList<String>();
	    File file = new File(pathname);
	    try {
	      Scanner scanner = new Scanner(file);
	      while (scanner.hasNextLine()) {
	        movies.add(scanner.nextLine());
	      }
	    } catch (FileNotFoundException e) {
	      System.out.println("File does not exist!");
	    }
	  }
	  
	  public String getRandomMovie(){
	    int movieIndex = (int)(Math.random()*movies.size());
	    return movies.get(movieIndex);
	  }

}
