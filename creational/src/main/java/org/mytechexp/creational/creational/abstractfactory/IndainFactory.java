package org.mytechexp.creational.creational.abstractfactory;

public class IndainFactory implements GlobalFactory{
   private Payment payment;

    public IndainFactory (PaymentType payment){
        switch (payment){
            case GAPY:
                this.payment=new Gpay();
                break;
                case PAYTM:
                this.payment=new PayTm();
                break;
            default: new IllegalArgumentException("Invalid payment type");

        }

    }
    @Override
    public void setPayment(double amount) {
        payment.pay(amount);
    }

    @Override
    public void getInvoice() {

    }
}
