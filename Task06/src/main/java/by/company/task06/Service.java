package by.company.task06;

/*Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
Номер банковского счета.
Создать массив объектов. Вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится
в заданном интервале.*/


public class Service {

    public static void main(String[] args) {
        Shop shop = new Shop("Green");
        shop.addCustomerToShopList(new Customer("Siarhei", "Kulik", "Minsk",551263, 4589));
        shop.addCustomerToShopList(new Customer("Petr", "Petrov", "Minsk",452263, 4829));
        shop.addCustomerToShopList(new Customer("Ivan", "Ivanov", "Minsk",631523, 3989));
        shop.addCustomerToShopList(new Customer("Andrey", "Andreev", "Minsk",582263, 4699));
        shop.addCustomerToShopList(new Customer("Alex", "Alexov", "Minsk",551593, 5289));
        System.out.println(shop.getListName());
        System.out.println(shop.getListDiapasonCardNumber(4500,5000));

    }
}
