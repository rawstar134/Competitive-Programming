import java.util.*;
public class Union {
    int first[] ={1,2,3,4,5};
    int second[] ={1,2,3};
    
    public int findUnion(){
        //to remove ,add , search all takes O(log n) time
        TreeSet<Integer> saveUnion = new TreeSet<Integer>();
        
        for (int i = 0; i <first.length; i++) {
            if(!saveUnion.contains(first[i])){
                saveUnion.add(first[i]);
            }
        }
        // Collections.addAll(saveUnion, first);
        
        for (int i = 0; i < second.length; i++) {
            if(!saveUnion.contains(second[i])){
                saveUnion.add(second[i]);
            }
        }
        // for (int i = 0; i < saveUnion.size(); i++) {
        //     System.out.println(saveUnion.get(i));
        // }
        return saveUnion.size();
        
    }
    
    public static void main(String[] args) {
        //find the union of the two arrays.
        System.out.println("Print the union of the two arrays");
        Union getCount = new Union();
        System.out.println(getCount.findUnion());
        
    }
}
