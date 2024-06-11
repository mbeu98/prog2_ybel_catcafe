import catcafe.FelineOverLord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import catcafe.CatCafe;

/**
 * test the methods of CatCafe
 */
public class CatCafeTest {

    CatCafe cafe;

    /**
     * will execute before each test to create cat objects
     */
    @BeforeEach
    void setUp() {
        cafe = new CatCafe();
        cafe.addCat(new FelineOverLord("Miss Chief Sooky", 2));
        cafe.addCat(new FelineOverLord("Gwenapurr Esmeralda", 3));
        cafe.addCat(new FelineOverLord("Morticia", 3));
        cafe.addCat(new FelineOverLord("Fitzby Darnsworth", 5));
        cafe.addCat(new FelineOverLord("Morticia", 5));
    }

    /**
     * test successfull if getCatCount() returns 3
     */
    @Test
    void getCatCountShouldReturnThree()
    {
        assertEquals(3, cafe.getCatCount());
    }

    /**
     * test successfull if getCatByName(Morticia) returns null
     */
    @Test
    void getCatByNameMorticiaShouldReturnNull(){
        assertNull(cafe.getCatByName("Morticia"));
    }

    /**
     * test successfull if getCatByName(Miss Chief Sooky) returns not null
     */
    @Test
    void getCatByNameMissChiefSookyShouldReturnObject(){
        assertNotNull(cafe.getCatByName("Miss Chief Sooky"));
    }

    /**
     * test successfull if getCatByName(Fitzby Darnsworth) returns not null
     */
    @Test
    void getCatByNameFitzbyDarnsworthShouldReturnObject(){
        assertNotNull(cafe.getCatByName("Fitzby Darnsworth"));
    }

    /**
     * test successfull if getCatByWeight(1,2) returns null
     */
    @Test
    void getCatByWeightOneAndTwoShouldReturnNull(){
        assertNull(cafe.getCatByWeight(1,2));
    }

    /**
     * test successfull if getCatByWeight(4,2) returns null
     */
    @Test
    void getCatByWeightFourAndTwoShouldReturnNull(){
        assertNull(cafe.getCatByWeight(4,2));
    }

    /**
     * test successfull if getCatByWeight(-2,2) returns null
     */
    @Test
    void getCatByWeightMinusTwoAndTwoShouldReturnNull(){
        assertNull(cafe.getCatByWeight(-2,2));
    }

    /**
     * test successfull if getCatByWeight(3,5) returns not null
     */
    @Test
    void getCatByWeightThreeAndFiveShouldReturnObject(){
        assertNotNull(cafe.getCatByWeight(3,5));
    }

    /**
     * test successfull if getCatByWeight(3,2) returns null
     */
    @Test
    void getCatByWeightThreeAndTwoShouldReturnNull(){
        assertNull(cafe.getCatByWeight(3,2));
    }

    /**
     * test successfull if getCatByWeight(5,7) returns not null
     */
    @Test
    void getCatByWeightFiveAndSevenShouldReturnObject(){
        assertNotNull(cafe.getCatByWeight(5,7));
    }


}
