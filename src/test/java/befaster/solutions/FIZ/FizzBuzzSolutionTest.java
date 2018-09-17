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

    @Test
    public void fizz() {
        assertThat(fizz.fizzBuzz(3), equalTo("fizz"));
    }


    @Test
    public void buzz() {
        assertThat(fizz.fizzBuzz(5), equalTo("buzz"));
    }

    
    @Test
    public void fizz_buzz() {
        assertThat(fizz.fizzBuzz(15), equalTo("fizz buzz"));
    }
    
    
}
