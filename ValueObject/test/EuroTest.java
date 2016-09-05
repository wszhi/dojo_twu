import org.junit.Test;

import static org.junit.Assert.*;


public class EuroTest {

    @Test
    public void shouldNotSameWhenCreateTwoFiveEuro() {
        Euro euro1 = new Euro(5);
        Euro euro2 = new Euro(5);
        assertNotSame(euro1, euro2);
    }

    @Test
    public void shouldEqualWhenCreateTwoFiveEuro() {
        Euro euro1 = new Euro(5);
        Euro euro2 = new Euro(5);
        assertEquals(euro1, euro2);
    }

    @Test
    public void shouldNotEqualWhenCreateFiveEuroAndTenEuro() {
        Euro euro1 = new Euro(5);
        Euro euro2 = new Euro(10);
        assertNotEquals(euro1, euro2);
    }

    @Test
    public void shouldNotHaveFiveEuroEqualToNull() {
        assertNotEquals(new Euro(5), null);
    }

    @Test
    public void shouldNotHaveFiveEuroEqualToOtherObject() {
        assertNotEquals(new Euro(5), new Object());
    }

    @Test
    public void shouldHaveTenEuroEqualToSevenEuroPlusThreeEuro() {
        assertEquals(new Euro(10), new Euro(7).add(new Euro(3)));
    }

    @Test
    public void shouldNotHaveTenEuroEqualToFiveEuroPlusTwoEuro() {
        assertNotEquals(new Euro(10), new Euro(5).add(new Euro(2)));
    }

    @Test
    public void shouldNotHaveTenEuroEqualToTenDollar() {
        assertNotEquals(new Euro(10),new Dollar(10));
    }

    @Test
    public void shouldHaveTenEuroEqualToThirteenPointFiveDollar() {
        assertEquals(new Euro(10), new Dollar(13.5));
    }
}
