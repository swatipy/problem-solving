import java.util.*;

public class Main {


    public static void main(String[] args) {

        int sumz= 0;
        List<Integer> arr = Arrays.asList(10, 20, 30, 40, 50, 50);

        for(int i=0; i<arr.size(); i++){

            sumz=sumz+arr.get(i);

        }
        System.out.println(sumz);

        Map<Integer, Integer> countMap=new HashMap<>();

        for (int num : arr) {
            // Step 3: Update the count in the map
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1); // Increment count
            } else {
                countMap.put(num, 1); // First occurrence, initialize to 1
            }
        }
        System.out.println(countMap);


    }
}