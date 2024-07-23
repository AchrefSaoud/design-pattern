package Adapter;

/*At first we have Xpay interface and its implementation */
/*For some reasons we decided to change the the payment gateway and use new vendor PayD*/
/*The problem that arises here is that we use Xpay payment gateway which takes an Xpay type of object. The
new vendor, PayD, only allows the PayD type of objects to allow the process */

/*for that reason we decided to create an adapter class*/
/*The Adapter pattern lets you to adapt what an object or a class exposes to what another object or class expects. It converts
the interface of a class into another interface the client expect */

public class XpayImpl implements Xpay {

    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private Short cardCVVNo;
    private Double amount;

    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }
    @Override
    public String getCardExpMonth() {
        return cardExpMonth;
    }
    @Override
    public String getCardExpYear() {
        return cardExpYear;
    }
    @Override
    public Short getCardCVVNo() {
        return cardCVVNo;
    }
    @Override
    public Double getAmount() {
        return amount;
    }
    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }
    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }
    @Override
    public void setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;
    }
    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        this.cardCVVNo = cardCVVNo;
    }
    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
