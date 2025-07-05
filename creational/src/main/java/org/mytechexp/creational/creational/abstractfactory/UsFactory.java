package org.mytechexp.creational.creational.abstractfactory;

public class UsFactory implements GlobalFactory{
    private Payment payment;
    private Invoice invoice;

    public UsFactory(PaymentType paymentType){
        switch (paymentType){
            case STRIPE:
                this.payment=new Stripe();
                this.invoice=new UsInvoice();
                break;
            case PAYPAL:
                this.payment=new PayPal();
                this.invoice=new UsInvoice();
                break;
                default: new IllegalArgumentException("Invalid payment type");
        }
    }
    @Override
    public void setPayment(double amout) {
     payment.pay(amout);
    }

    @Override
    public void getInvoice() {
        invoice.generate();
    }
}
