
package repository;

import java.util.List;


public interface IBubbleSortRepository {
    List<Integer> inputValueOfArray();
    void sortArrayAscending(List<Integer> a);
    void sortArrayDescending(List<Integer> a);
}