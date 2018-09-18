package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzSolutionTest {
    private FizzBuzzSolution fizz;

    @Before
    public void setUp() {

    	fizz = new FizzBuzzSolution();
    }


//    @Test
//    public void fizz1() {
//        assertThat(fizz.fizzBuzz(1), equalTo("1"));
//    }
//    
//    
    @Test
    public void fizz() {
        assertThat(fizz.fizzBuzz(27), equalTo("fizz fake deluxe"));
    }


    @Test
    public void buzz_deluxe() {
        assertThat(fizz.fizzBuzz(55), equalTo("buzz fake deluxe"));
    }
    
    
//    @Test
//    public void buzz() {
//        assertThat(fizz.fizzBuzz(65), equalTo("buzz fake deluxe"));
//    }
//
//    
//    @Test
//    public void fizz_buzz() {
//        assertThat(fizz.fizzBuzz(555), equalTo("fizz buzz fake deluxe"));
//    }
//    
    
}
