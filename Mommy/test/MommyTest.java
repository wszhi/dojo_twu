import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MommyTest {

    @Test
    public void shouldReturnEmptyStringWhenGivenEmptyInput() throws Exception {
        Mommy mommy = new Mommy();
        String result = mommy.mommify("");
        assertEquals("", result);
    }

    @Test
    public void shouldReturnHWhenInputH() throws Exception {
        Mommy mommy = new Mommy();
        String result = mommy.mommify("h");
        assertEquals("h", result);
    }

    @Test
    public void shouldReturnMommyWhenInputI() throws Exception {
        Mommy mommy = new Mommy();
        String result = mommy.mommify("i");
        assertEquals("mommy", result);
    }

    @Test
    public void shouldReturnMommyWhenInputA() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("mommy",mommy.mommify("a"));
    }

    @Test
    public void shouldReturnHMommyWhenInputHI() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("hmommy",mommy.mommify("hi"));
    }

    @Test
    public void shouldReturnHMommyMWhenInputIsHim() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("hmommym",mommy.mommify("him"));
    }

    @Test
    public void shouldReturnHMommyWhenInputHii() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("hmommy",mommy.mommify("hii"));

    }

    @Test
    public void shouldReturnHardWhenInputHard() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("hard",mommy.mommify("hard"));

    }
}
