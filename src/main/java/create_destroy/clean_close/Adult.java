package create_destroy.clean_close;

public class Adult {

    public static void main(String[] args) {

        try (Room myRoom = new Room(7)) {
            System.out.println("Goodbye");
        }
    }
}