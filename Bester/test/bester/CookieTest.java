package bester;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CookieTest {
    @Test
    public void shouldReturnTrueIfCookie1Better() {
        Cookie cookie1=new Cookie(4);
        Cookie cookie2=new Cookie(3);
        assertTrue(cookie1.isBetterThan(cookie2));
    }

    @Test
    public void shouldReturnFalseIfCookie1NotBetter() throws Exception {
        assertFalse((new Cookie(2)).isBetterThan(new Cookie(3)));
    }
}