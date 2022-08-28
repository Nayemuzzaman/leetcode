//import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;


public class findDublicate {
    
    void findDublicateHashMap(int[] inputArray){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int element: inputArray){
            if (map.get(element) == null) {
                map.put(element, 1);
            }
            else{
                map.put(element, map.get(element)+1);
            }
        }
        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
        for(Entry<Integer, Integer> entry: entrySet){
            if(entry.getValue() > 1){
                System.out.println("Dublicate value: "+entry.getKey()+" found "+entry.getValue()+" times.");
            }
        }
    }
    public static void main(String[] args) {
        int[] inputArray = {1,3,5,7,3,4,5,3};
        findDublicate fd = new findDublicate();
        fd.findDublicateHashMap(inputArray);
        System.out.println("HasMap"+fd);

    }
}
