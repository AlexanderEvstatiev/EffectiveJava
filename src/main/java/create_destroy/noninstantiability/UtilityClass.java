package create_destroy.noninstantiability;

public class UtilityClass {

    // Suppress default constructor for noninstantiability
    private UtilityClass() {
        throw new AssertionError();
    }
}
