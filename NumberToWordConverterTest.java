import org.junit.Assert.*;  
import org.junit.Test;  
  
public class NumberToWordConverterTest {  
  
    @Test  
    public void testFindMax(){  
        assertEquals(One Hundred and Sixty Five,NumberToWordConverter.numToWord(165));  
        assertNotEquals(Zero,NumberToWordConverter.numToWord(96));  
    }  
}  
