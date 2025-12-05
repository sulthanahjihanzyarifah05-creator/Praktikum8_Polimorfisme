
package latihan1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog());
        animals.add(new Bird());
        animals.add(new Dog());
        animals.add(new Bird());

        for (Animal animal : animals) {
            animal.speak(); // Polimorfisme

            if (animal instanceof Dog) {
                ((Dog) animal).fetch(); // Method khusus Dog
            }
        }
    }
}