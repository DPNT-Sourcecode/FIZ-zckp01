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
    public void compute_sum() {
        assertThat(fizz.fizzBuzz(3), equalTo("Hello, John!"));
    }
}
