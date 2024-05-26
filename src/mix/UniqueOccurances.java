package mix;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurances {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3,3,3,4,3};
        System.out.println(uniqueOccrOfElem(arr));
    }

    private static boolean uniqueOccrOfElem(int[] arr) {
        Map<Integer, Integer> mapp = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (Integer i: arr){
            System.out.print(i+" ");
            if(!mapp.containsKey(i)){
                mapp.put(i, 1);
            }else {
                mapp.put(i, mapp.get(i)+1);
            }
        }
        System.out.println(mapp);
        for(Map.Entry<Integer, Integer> entry: mapp.entrySet()){
            boolean res= set.add(entry.getValue());

            if(!res){
                return false;
            }
            System.out.println(entry.getValue());
        }
        return true;
    }
}
