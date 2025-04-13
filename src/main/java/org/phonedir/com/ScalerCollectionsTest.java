package org.phonedir.com;

public class ScalerCollectionsTest {
    public static void main(String[] args) {
        initiatePayment(new MpesaPay());
        initiatePayment(new EquityBankPay());
    }

    public static void initiatePayment(PaymentMethod pm){//good design pattern - accepts all payment types
        pm.pay();
    }

}

interface  PaymentMethod{
    void pay();
}

class MpesaPay implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Mpesa Pay");
    }
}

interface BankPay extends PaymentMethod{
    void paymentMethod();
}

class EquityBankPay implements BankPay{

    @Override
    public void paymentMethod() {
        System.out.println("EFT");
    }

    @Override
    public void pay() {
        System.out.println("Equity Bank Pay");
    }
}
