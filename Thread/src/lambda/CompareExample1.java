package lambda;

import java.util.Comparator;

public class CompareExample1 {
    public CompareExample1() {
        Comparator<String> c = (String lhs, String rhs) -> lhs.compareTo(rhs);
        int result = c.compare("Hello", "World");

    }
}
