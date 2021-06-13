import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Main {

    public static <T> Collection <T> removeDuplicate(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,4,2,3,6,4,1,5,3,4,6,6,7,7));
        System.out.println(removeDuplicate(numbers));
    }
}
