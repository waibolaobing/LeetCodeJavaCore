import org.junit.Assert;
import org.junit.Test;


public class ValidAnagramTest {

    @Test
    public void isAnagram() {
        ValidAnagram validAnagram = new ValidAnagram();
        Assert.assertTrue(validAnagram.isAnagram("anagram","nagaram"));
    }
}
