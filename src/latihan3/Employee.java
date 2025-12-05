
package latihan3;

public class Employee implements Payable {

    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public double pay() {
        return salary;   // gaji tetap
    }
}