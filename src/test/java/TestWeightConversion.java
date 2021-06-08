import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestWeightConversion {
    private static WeightConvertion wc;

    @BeforeClass
    public static void setup(){
        wc = new WeightConvertion();
    }
    @Test
    public void test_kg_to_grams(){
        assertEquals(1000, wc.kg_to_grams_conversion(1));
    }

    @Test
    public void test_grams_to_mg(){
        assertEquals(1000, wc.grams_to_mg(1));
    }

    @Test
    public void test_pound_to_kg_conversion(){
        assertEquals(1 , wc.pound_to_kg_conversion(2.2));
    }
}
