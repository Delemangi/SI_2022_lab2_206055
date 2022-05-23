import java.util.ArrayList;
import java.util.List;

public class SILab2 {
    public static List<String> function(List<String> list) { // 1
        if (list.size() <= 0) { // 2
            throw new IllegalArgumentException("List length should be greater than 0"); // 3
        }
        int n = list.size(); // 4
        int rootOfN = (int) Math.sqrt(n); // 5
        if (rootOfN * rootOfN != n) { // 6
            throw new IllegalArgumentException("List length should be a perfect square"); // 7
        }
        List<String> numMines = new ArrayList<>(); // 8
        for (int i = 0; i < n; i++) { // 9
            if (!list.get(i).equals("#")) { // 10
                int num = 0; // 11
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) { // 12
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){ // 13
                        num += 2; // 14
                    }
                    else { // 15
                        num  += 1; // 16
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){ // 17
                    num++; // 18
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){ // 19
                    num++; // 20
                }
                numMines.add(String.valueOf(num)); // 21
            }
            else { // 22
                numMines.add(list.get(i)); // 23
            }
        }
        return numMines; // 24
    } // exit
}