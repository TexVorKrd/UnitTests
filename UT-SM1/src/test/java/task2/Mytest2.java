package task2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Mytest2 {

    @Test
    public void testAssertions(){
        String text ="Hello, Word!";

        Assertions.assertThat(text).isNotNull();
        Assertions.assertThat(text).startsWith("Hello-");
        Assertions.assertThat(text).endsWith("Word!");

    }

}
