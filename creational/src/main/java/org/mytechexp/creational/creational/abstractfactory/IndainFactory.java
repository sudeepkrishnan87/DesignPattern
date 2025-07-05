package org.mytechexp.creational.creational.abstractfactory;

public class IndainFactory implements GlobalFactory{
   private Payment payment;
   private Invoice invoice;

    public IndainFactory (PaymentType payment){
        switch (payment){
            case GAPY:
                this.payment=new Gpay();
                this.invoice=new GstInvoice();
                break;
                case PAYTM:
                this.payment=new PayTm();
                this.invoice=new GstInvoice();
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
    invoice.generate();
    }
}
