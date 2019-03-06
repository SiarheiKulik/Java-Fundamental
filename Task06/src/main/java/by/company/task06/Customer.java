package by.company.task06;

import java.util.Objects;

public class Customer {

    {
        idGenerator++;
    }
    private static int idGenerator = 0;
    private int customerId;
    private String name;
    private String surname;
    private String address;
    private int cardNumber;
    private int acountNumber;

    public Customer(String name, String surname, String address, int cardNumber, int acountNumber) {
        this.customerId = customerId;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.cardNumber = cardNumber;
        this.acountNumber = acountNumber;
    }

    public static int getIdGenerator() {
        return idGenerator;
    }

    public static void setIdGenerator(int idGenerator) {
        Customer.idGenerator = idGenerator;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getAcountNumber() {
        return acountNumber;
    }

    public void setAcountNumber(int acountNumber) {
        this.acountNumber = acountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId &&
                cardNumber == customer.cardNumber &&
                acountNumber == customer.acountNumber &&
                Objects.equals(name, customer.name) &&
                Objects.equals(surname, customer.surname) &&
                Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, name, surname, address, cardNumber, acountNumber);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", acountNumber=" + acountNumber +
                '}';
    }
}
