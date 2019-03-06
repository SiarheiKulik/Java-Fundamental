package by.company.task06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {

    private Customer customer;
    private String shopName;
    private List<Customer> customers = new ArrayList<>();

    public Shop(String shopName) {
        this.shopName = shopName;
    }

    public void addCustomerToShopList(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getListName() {
        List<Customer> list = new ArrayList<>(customers);
        Collections.sort(list, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }

        });
        return list;
    }

    public List<Customer> getListSurname() {
        List<Customer> list = new ArrayList<>(customers);
        Collections.sort(list, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getSurname().compareToIgnoreCase(o2.getSurname());
            }
        });
        return list;
    }

    public List<Customer> getListDiapasonCardNumber(int diapasonStart, int diapasonEnd) {
        List<Customer> list = new ArrayList<>();
        for (Customer c : customers) {
            if (c.getCardNumber() >= diapasonStart && c.getCardNumber() <= diapasonEnd) {
                list.add(c);
            }
        }
        return list;
    }


}
