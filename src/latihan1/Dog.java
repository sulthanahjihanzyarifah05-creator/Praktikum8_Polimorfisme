
package latihan1;

public class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("Dog: Woof woof!");
    }

    public void fetch() {
        System.out.println("Dog is fetching a stick!");
    }
}