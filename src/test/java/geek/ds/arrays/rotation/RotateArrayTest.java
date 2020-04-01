package geek.ds.arrays.rotation;

import org.junit.Test;

import static geek.ds.arrays.rotation.RotateArray.*;
import static geek.ds.arrays.rotation.RotateArray.rotateLeft;
import static geek.ds.arrays.rotation.RotateArray.rotateLeftByJuggle;
import static geek.ds.arrays.rotation.RotateArray.rotateRight;
import static org.assertj.core.api.Assertions.assertThat;


public class RotateArrayTest {

    @Test
    public void should_be_able_to_left_rotate_an_array() {
        int[] input = {1, 2, 3, 4, 5};
        int[] output = {2, 3, 4, 5, 1};
        assertThat(rotateLeft(input)).isEqualTo(output);
    }

    @Test
    public void shoulde_be_able_to_return_same_array_if_only_single_element_is_present() {
        int[] input = {1};
        int[] output = {1};
        assertThat(rotateLeft(input)).isEqualTo(output);

    }

    @Test
    public void should_be_able_to_right_rotate_an_array() {

        int[] input = {1, 2, 3, 4, 5};
        int[] output = {5, 1, 2, 3, 4};
        assertThat(rotateRight(input)).isEqualTo(output);

    }

    @Test
    public void should_be_able_to_rotate_an_array_by_given_number_of_elements() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] output = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        assertThat(rotateLeftByNumber(input, 3)).isEqualTo(output);
    }

    @Test
    public void should_rotate_an_array_using_jugling_algorithm() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] output = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        assertThat(rotateLeftByJuggle(input, 3)).isEqualTo(output);

    }
}