/*
put()	Adds or updates a key-value pair
get()	Returns the value for a given key
remove()	Removes the key and its value
containsKey()	Checks if the map contains the key
keySet()	Returns a set of all keys

*/

package Map;
import java.util.HashMap;
import java.util.Map;

public class MapPrograms {
    public static void main(String[] args) {
       HashMap<Integer,String> map = new HashMap<>();
       map.put(1,"Chaitya" );
       map.put(2,"Darshan" );
       map.put(3,"Ajay" );
       map.put(4,"Ashwin" );
       map.put(5,"2d" );
       System.out.println("Map: "+map);

       for(Map.Entry<Integer,String> entry : map.entrySet())
       {
        System.out.println(entry.getKey()+"---->"+entry.getValue());
       }

       System.out
       for(Integer ref:map.keySet())
       {

       }
    }
}
