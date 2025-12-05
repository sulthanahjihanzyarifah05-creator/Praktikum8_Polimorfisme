
package latihan4;


public class Main {
    public static void main(String[] args) {

        Base b = new Sub();
        b.f(10);    // 10 adalah int → Autobox: Integer → tetapi lihat hasilnya
    }
}