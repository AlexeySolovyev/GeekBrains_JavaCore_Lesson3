package Homework2;

public class MainPhoneBook {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.setContactByName("Василий", 123);
        phoneBook.setContactByName("Василий", 2222);
        phoneBook.setContactByName("Андрей", 3333);
        phoneBook.setContactByName("Михаил", 44444);
        phoneBook.setContactByName("Андрей", 124124);


        System.out.println(phoneBook.getContactsByName("Василий"));
        System.out.println(phoneBook.getContactsByName("Андрей"));
        System.out.println(phoneBook.getContactsByName("Михаил"));
        System.out.println(phoneBook.getContactsByName("Петр"));

    }
}
