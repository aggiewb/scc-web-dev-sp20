import java.util.*;

public class Unique {
	public static boolean isUnique(Map<String, String> names){
	    Collection<String> firstNames = names.values();
	    Set<String> uniqueNames = new HashSet<>();
	    
	    for(String name : firstNames){
	        uniqueNames.add(name);
	    }
	    
	    if(uniqueNames.size() < names.size()){
	        return false;
	    }
	   
	    return true;
	}
}
