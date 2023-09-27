import java.util.HashMap;
import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        String  str= " hello my name is Bich hello";
        String arr[]= str.split(" ");
        String key;
        Integer value;
        Map<String,Integer> map = new HashMap<>();
        for( String s:  arr){
            if(map.containsKey(s)){
                value= map.get(s);
                value++;

            }else map.put(s,1);
        }

    }
}
