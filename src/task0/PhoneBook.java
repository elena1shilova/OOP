package task0;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        addContact(phoneBook, "Иван", "123-456-7890");
        addContact(phoneBook, "Мария", "987-654-3210");
        addContact(phoneBook, "Иван", "555-123-4567"); // Добавляем второй телефон для Ивана

        displayPhoneBook(phoneBook);
    }

    public static void addContact(HashMap<String, List<String>> phoneBook, String name, String phoneNumber) {
        List<String> phoneNumbers = phoneBook.get(name);
        if (phoneNumbers == null) {
            phoneNumbers = new ArrayList<>();
            phoneBook.put(name, phoneNumbers);
        }
        phoneNumbers.add(phoneNumber);
    }

    public static void displayPhoneBook(HashMap<String, List<String>> phoneBook) {

        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(phoneBook.entrySet());

        Collections.sort(entries, (entry1, entry2) -> entry2.getValue().size() - entry1.getValue().size());

        for (Map.Entry<String, List<String>> entry : entries) {
            System.out.println("Имя: " + entry.getKey());
            System.out.println("Телефоны: " + entry.getValue());
        }
    }
}
