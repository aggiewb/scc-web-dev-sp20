import java.util.ArrayList;

public class Test3_ArrayList {

    public static void main(String[] args){
        //build a list of words, add tildes, and then removes them
        
        //create an array list
        ArrayList<String> words = new ArrayList<String>();
        
        //fill the list
        words.add("seal");
        words.add("cat");
        words.add("dog");
        words.add("fox");
        words.add("slot");
        
        System.out.println("Words: " + words);
        
        //insert one tilde in front of each word
        for(int i = 0; i < words.size(); i+=2){  
            words.add(i, "~");
        
        }
        System.out.println("After we added the tilde =" + words);
        
        //remove the tildes
        for(int i = 0; i < words.size(); i++){
            words.remove(i);
        }
        System.out.println("After we removed the tilde" + words);
        
    }
}

