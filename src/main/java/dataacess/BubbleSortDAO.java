
package dataacess;

import common.Library;
import java.util.ArrayList;
import java.util.List;

public class BubbleSortDAO {
    private static BubbleSortDAO instance = null;
    Library l;

    public BubbleSortDAO() {
        l = new Library();
    }
    
    public static BubbleSortDAO Instance() {
        if (instance == null) {
            synchronized (BubbleSortDAO.class) {
                if (instance == null) {
                    instance = new BubbleSortDAO();
                }
            }
        }
        return instance;
    }
    
    public List<Integer> inputValueOfArray() {
        System.out.println("Input Length Of Array");
        int n = l.getInt("Enter number", 1, 1000000);
        List<Integer> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int x = l.getIntNoLimit("Enter number " + i);
            a.add(x);
        }
        return a;
    }
    
    public void sortArrayAscending(List<Integer> a) {
        int len = a.size();
        if (len == 0) {
            System.err.println("List empty.");
        }
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (a.get(j) < a.get(minIndex)) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = a.get(minIndex);
                a.set(minIndex, a.get(i));
                a.set(i, temp);
            }
        }
        System.out.println();
        for (int i = 0; i < a.size(); i++) {
            if (i == a.size() - 1) {
                System.out.print("[" + a.get(i) + "]");
                break;
            }
            System.out.print("[" + a.get(i) + "]->");
        }
        System.out.println();
    }
    
    public void sortArrayDescending(List<Integer> a) {
        int len = a.size();
        if (len == 0) {
            System.err.println("List empty.");
        }
        for (int i = 0; i < len - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (a.get(j) > a.get(maxIndex)) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = a.get(maxIndex);
                a.set(maxIndex, a.get(i));
                a.set(i, temp);
            }
        }
        System.out.println();
        for (int i = 0; i < a.size(); i++) {
            if (i == a.size() - 1) {
                System.out.print("[" + a.get(i) + "]");
                break;
            }
            System.out.print("[" + a.get(i) + "]<-");
        }
        System.out.println();
    }
        
}