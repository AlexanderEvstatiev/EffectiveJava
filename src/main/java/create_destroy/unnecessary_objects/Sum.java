package create_destroy.unnecessary_objects;

public class Sum {

     static long sum() {
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }
}
