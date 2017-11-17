package coding.dojo.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(JUnit4.class)
public class KataTest {
    @Test
    public void returnTwo() throws Exception {
        assertThat(Kata.returnTwo()).isEqualTo(2);
    }


}