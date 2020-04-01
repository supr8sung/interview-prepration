package geek.generics;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class VeryGenericTest {
    @Test
    public void should_convert_array_of_integers_to_list() {
        Integer[] arr = {1, 2, 3, 4};
        List<Integer> list = VeryGeneric.toList(arr);
        Assertions.assertThat(list).containsExactly(1,2,3,4);
    }
}