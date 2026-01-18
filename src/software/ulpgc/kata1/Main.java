package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person pepe = new Person("Pepe", LocalDate.of(1999, 3, 3));
        System.out.println(pepe);
    }
}
