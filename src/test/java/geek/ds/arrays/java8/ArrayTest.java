package geek.ds.arrays.java8;

import org.assertj.core.util.Arrays;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayTest {

    @Test
    public void should_concat_arrays_of_integers() {
        Integer[] arr = Array.concat(Arrays.array(), Arrays.array(1, 2, 3));
        assertThat(arr).containsExactly(1, 2, 3);

    }

    @Test
    public void should_concat_arrays_of_string() {
        String[] arr = Array.concat(Arrays.array(""), Arrays.array("abc"));
        assertThat(arr).containsExactly("", "abc");
    }

    @Test
    public void should_count_the_occurence_of_number_from_list() {
        long count = Array.countOccurrences(Arrays.array(1, 2, 3, 4, 5), 2);
        assertThat(count).isEqualTo(1);
    }

    @Test
    public void should_count_the_occurence_of_a_name_from_list() {
        long count = Array.countOccurrences(Arrays.array("nimrat", "nimrat", "tarsem", "happy", "sartaaj",
                "nimrat"),
                "nimrat");
        assertThat(count).isEqualTo(3);

    }
    @Test
    public void should_return_index_of_last_match(){
        int i = Array.lastIndexOf(Arrays.array(1,2,3,4,4,5,6,6,7,4,3), 4);
        assertThat(i).isEqualTo(9);
    }
}