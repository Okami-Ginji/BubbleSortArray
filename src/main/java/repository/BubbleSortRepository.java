
package repository;


import dataacess.BubbleSortDAO;
import java.util.List;

public class BubbleSortRepository implements IBubbleSortRepository{

    @Override
    public List<Integer> inputValueOfArray() {
        List<Integer> a = BubbleSortDAO.Instance().inputValueOfArray();
        return a;
    }

    @Override
    public void sortArrayAscending(List<Integer> a) {
        BubbleSortDAO.Instance().sortArrayAscending(a);

    }

    @Override
    public void sortArrayDescending(List<Integer> a) {
        BubbleSortDAO.Instance().sortArrayDescending(a);
    }
}
