
package latihan3;

import java.util.ArrayList;
import java.util.List;

public class MainPayment {
    public static void main(String[] args) {

        List<Payable> payments = new ArrayList<>();

        payments.add(new Employee(5000000));         // Gaji tetap
        payments.add(new Contractor(75000, 40));     // 75rb per jam, 40 jam
        payments.add(new Contractor(60000, 20));     // 60rb per jam, 20 jam

        double totalPayment = 0;

        for (Payable p : payments) {
            totalPayment += p.pay();
        }

        System.out.println("Total pembayaran = Rp " + totalPayment);
    }
}

