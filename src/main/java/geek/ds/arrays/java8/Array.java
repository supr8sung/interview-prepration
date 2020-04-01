package geek.ds.arrays.java8;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array {
    public static void main(String[] args) {

        int[] ints = filterNonUnique(new int[]{1, 2, 3, 2, 4});
        Arrays.stream(ints).forEach(System.out::println);
    }

    public static <T> T[] concat(T[] first, T[] second) {
        return Stream.concat(Arrays.stream(first), Arrays.stream(second)).toArray(i -> (T[]) Arrays.copyOf(new Object[0], i, first.getClass()));

    }

    public static <T> long countOccurrences(T[] numbers, T value) {
        return Arrays.stream(numbers).filter(e -> e.equals(value)).count();
    }

    public static <T> int lastIndexOf(T[] elements, T el) {
        return IntStream.iterate(elements.length - 1, i -> i - 1)
                // .limit(elements.length)
                .filter(index -> elements[index].equals(el))
                .findFirst()
                .orElse(-1);

    }

    public static int indexOf(int[] elements, int e) {
        return IntStream.range(0, elements.length)
                .filter(index -> index == e)
                .findFirst()
                .orElse(-1);
    }

    public static int[] filterNonUnique(int[] elements) {
        return Arrays.stream(elements).distinct().toArray();
    }

    public static int[] flatten(Object[] elements) {
        return Arrays.stream(elements)
                .flatMapToInt(e1 -> e1 instanceof int[]
                        ? Arrays.stream((int[]) e1)
                        :IntStream.of((int)e1)
                ).toArray();
    }
}

