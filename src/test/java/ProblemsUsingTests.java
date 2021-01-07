import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ProblemsUsingTests {
    private List<Integer> nums;
    private List<String> nameList;
    @Before
    public void setUp(){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        this.nums = new ArrayList<>();

        // write code to replace all values in list to value * 2 and assign that to this.nums;

        // code here

        List<String> names = new ArrayList<>(Arrays.asList("matt", "nemo", "puNks", "cat", "dog"));
        this.nameList = new ArrayList<>();

        // write code to fill this.nameList with then names from names but with each name first and last character
        // to upper case and the middle chars to lower case
        // "matt" => "MatT"
        // "puNks" => "PunkS"

        // code here

    }

    @Test
    public void verifyNums(){
        List<Integer> answer = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        int size = answer.size();
        assertEquals(size, this.nums.size());
        for(int i = 0; i < size; i++){
            assertEquals(this.nums.get(i), answer.get(i));
        }
    }
    @Test
    public void verifyNames(){
        List<String> cappedFirstLast = new ArrayList<>(Arrays.asList("MatT", "NemO", "PunkS", "CaT", "DoG"));
        int len = cappedFirstLast.size();
        assertEquals(len, this.nameList.size());
        for(int i = 0; i < len; i++){
            assertEquals(this.nameList.get(i), cappedFirstLast.get(i));
        }
    }
}