
package latihan3;


public class Contractor implements Payable {

    private double hourlyRate;
    private int hoursWorked;

    public Contractor(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double pay() {
        return hourlyRate * hoursWorked; // gaji berdasarkan jam kerja
    }
}