//Student's Full name: Tasfique Enam
//Student's ID: 5886429
//Task1

package labtask9;

import java.util.*;

public class Theatre {
    public static void main(String[]args){
         ArrayList <Movie> list = new ArrayList<Movie>();
         
        list.add(new Movie("Meaning of Life ",2,2)); //populating data in collection array list
        list.add(new Movie("Existence is Pain ",3,4));
        list.add(new Movie("Death is Eminent ",3,4));
        
         Iterator<Movie> itr = list.iterator(); //using iterator
         //Movie retrieveMovie;
         while (itr.hasNext())
         {
            Movie retrieveMovie = itr.next();
            System.out.println("Title "+retrieveMovie.getTitle() + " Duration "+ retrieveMovie.getDuration() + " Rating " + retrieveMovie.getRating());
         }
    }
  
}
