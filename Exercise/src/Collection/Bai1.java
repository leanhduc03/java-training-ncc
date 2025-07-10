package Collection;

import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        int n = 100000;
        List<Integer> A = new ArrayList<>(n);
        Random random = new Random();
        
        for (int i = 0; i < n; i++) {
            A.add(random.nextInt(2001)); 
        }
        
        Set<Integer> uniqueNumbers = new HashSet<>(A);
        List<Integer> B = new ArrayList<>(uniqueNumbers);
        
        System.out.println("Số phần tử trong dãy A: " + A.size());
        System.out.println("Số phần tử trong dãy B: " + B.size());
        
        Map<Integer, Integer> frequency = new HashMap<>();       
        for (int num : A) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        int mostFrequentNumber = -1;
        int maxFrequency = 0;
        
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentNumber = entry.getKey();
            }
        }   
        System.out.println(mostFrequentNumber + " ; " + maxFrequency);
        

        int m = 10000;
        List<Integer> C = new ArrayList<>(m);
        
        for (int i = 0; i < m; i++) {
            C.add(random.nextInt(2001) + 1000);
        }

        Set<Integer> setA = new HashSet<>(A);
        int existInA = 0;
        for (int num : C) {
            if (setA.contains(num)) {
                existInA++;
            }
        }
        
        System.out.println("Số phần tử của C xuất hiện trong A: " + existInA);
        System.out.println("Số phần tử của C không xuất hiện trong A: " + (C.size() - existInA));
    }
}
