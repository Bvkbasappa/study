package study;
import java.util.ArrayList;
import java.util.List;


public class StringHand {


	    // create an object of list using ArrayList
	    static List<String> places = new ArrayList<>();

	    // preparing our data
	    public static List<String> getPlaces(){

	        // add places and country to the list
	        places.add("I,AM,HE, HERE");
	       

	        return places;
	    }

	    public static void main( String[] args ) {

	        List<String> myPlaces = getPlaces();
	        System.out.println("Places from Nepal:");
	        
	        // Filter places from Nepal
	        myPlaces.stream()
	                .filter((p) -> p.startsWith("I"))
	                .map((p) -> p.toUpperCase())
	                .sorted()
	                .forEach((p) -> System.out.println(p));
	    }

	}

