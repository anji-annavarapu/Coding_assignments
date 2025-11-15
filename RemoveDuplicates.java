/*
  In this program I used generacis for resuability for different data types
*/
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static <T> ArrayList<T> removeDuplicatesFromList(List<T> intList){
        ArrayList intArray=new ArrayList<T>();
        for(T element:intList){
            if(!intArray.contains(element)) intArray.add(element);
        }
        return intArray;
    }
}
