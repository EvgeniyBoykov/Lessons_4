package HomeWork_4;

import java.util.ArrayList;
import java.util.HashMap;
//2. Написать простой класс «Телефонный Справочник», который хранит в себе
// список фамилий и телефонных номеров. В этот телефонный справочник с помощью
// метода add() можно добавлять записи, а с помощью метода get() искать номер телефона
// по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
// (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
public class PhoneBook {
    private HashMap<String, ArrayList<String>> phone_Book = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phonesForLastName = phone_Book.getOrDefault(lastName, new ArrayList<>());
        phonesForLastName.add(phoneNumber);
        phone_Book.put(lastName, phonesForLastName);
    }

    public ArrayList<String> get(String lastName) {
        return phone_Book.get(lastName);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Бачуркин", "+7925645823");
        phoneBook.add("Решетов", "+7927654823");
        phoneBook.add("Симонов", "+7917654886");
        phoneBook.add("Бобров", "+7967654946");
        phoneBook.add("Гудков", "+7937653465");
        phoneBook.add("Симонов", "+7999653638");
        System.out.println(phoneBook.get("Симонов"));
    }
}


