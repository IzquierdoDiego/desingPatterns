package org.example.prototype;

public class CreditCart implements Cloneable{

    private String titularName;
    private String cartId;
    private String dueDate;
    private int securityCode;

    public CreditCart(String titularName, String cartId, String dueDate, int securityCode) {
        this.titularName = titularName;
        this.cartId = cartId;
        this.dueDate = dueDate;
        this.securityCode = securityCode;
    }

    @Override
    protected CreditCart clone() throws CloneNotSupportedException{
        return (CreditCart) super.clone();
    }

    public String getTitularName() {
        return titularName;
    }

    public void setTitularName(String titularName) {
        this.titularName = titularName;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public String toString() {
        return "CreditCart{" +
                "titularName='" + titularName + '\'' +
                ", cartId='" + cartId + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", securityCode=" + securityCode +
                '}';
    }
}
