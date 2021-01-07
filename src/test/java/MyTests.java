import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class MyTests {

    @Test
    public void stringsEqual(){
        String correct = "Codeup";
        String input = "Codeup";

        assertEquals(correct, input);
    }

    @Test
    public void arraySame(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void arrayEqual(){
        int[] nums = {1,2,3};
        int[] otherNums = new int[3];
        otherNums[0] = 1;
        otherNums[1] = 2;
        otherNums[2] = 3;
        assertArrayEquals(nums, otherNums);
    }

    @Test
    public void checkContains(){
        String language = "PHP";

        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));

    }


}
