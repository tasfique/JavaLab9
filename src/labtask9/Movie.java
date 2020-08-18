//Student's Full name: Tasfique Enam
//Student's ID: 5886429
//Task1
package labtask9;


public class Movie {
      String title; //variables
      Double duration;
      int rating;
      
      public Movie(String title, double duration, int rating){ //setting details.
          this.title = title;
          this.duration = duration;
          this.rating = rating;
      }
      
      String getTitle(){ //get method
          return title;
      }
      
      Double getDuration(){
          return duration;
      }
      
      int getRating(){
          return rating;
      }
      
      @Override
      public String toString(){
          return title + duration + rating;
      }
    
}
