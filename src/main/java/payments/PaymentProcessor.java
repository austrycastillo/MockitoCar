package payments;

public class PaymentProcessor {


    private PaymentGateway paymentGateway;
    public PaymentProcessor (PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount){
        boolean resp;
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));
        if(response.getStatus() == PaymentResponse.PaymentStatus.OK)
            resp = true;
        else
            resp = false;
        return resp;
    }

}
