package Homework2;

public class MainPhoneBook {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.setContactByName("Василий", 1441269);
        phoneBook.setContactByName("Василий", 1123312);
        phoneBook.setContactByName("Андрей", 1326720);
        phoneBook.setContactByName("Михаил", 1367745);
        phoneBook.setContactByName("Андрей", 1418910);


        System.out.println(phoneBook.getContactsByName("Василий"));
        System.out.println(phoneBook.getContactsByName("Андрей"));
        System.out.println(phoneBook.getContactsByName("Михаил"));
        System.out.println(phoneBook.getContactsByName("Петр"));

    }
}
