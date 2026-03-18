class Payment {
    void pay() {
        System.out.println("Payment processing...");
    }
}

class UPI extends Payment {
    void pay() {
        System.out.println("Payment using UPI");
    }
}

class Card extends Payment {
    void pay() {
        System.out.println("Payment using Card");
    }
}

public class  polymor_ism {
    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay();

        p = new Card();
        p.pay();
    }
}