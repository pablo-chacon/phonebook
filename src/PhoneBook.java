import contactDB.Contact;


import java.util.*;

public class PhoneBook implements Crud {

    static public List<LinkedHashMap<String, String>> phoneBook = new ArrayList<>();
    static public Scanner sc = new Scanner(System.in);

    public void defaultContact() {
        LinkedHashMap<String, String> defualtContact1 = new LinkedHashMap<>();
        defualtContact1.put("First Name", "Marcus");
        defualtContact1.put("Last Name", "Nordman");
        defualtContact1.put("Age", "23");
        defualtContact1.put("Phone", "0734567892");
        defualtContact1.put("Street Address", "Skolvägen");
        defualtContact1.put("Street Number", "6");
        defualtContact1.put("Country", "Sweden");
        defualtContact1.put("Zip Code", "98324");


        LinkedHashMap<String, String> defualtContact2 = new LinkedHashMap<>();
        defualtContact2.put("First Name", "Lisa");
        defualtContact2.put("Last Name", "Nordberg");
        defualtContact2.put("Age", "27");
        defualtContact2.put("Phone", "0732568765");
        defualtContact2.put("Street Address", "Johansberg");
        defualtContact2.put("Street Number", "2");
        defualtContact2.put("Country", "Sweden");
        defualtContact2.put("Zip Code", "98213");

        LinkedHashMap<String, String> defualtContact3 = new LinkedHashMap<>();
        defualtContact3.put("First Name", "Johan");
        defualtContact3.put("Last Name", "Lisaan");
        defualtContact3.put("Age", "45");
        defualtContact3.put("Phone", "0723456789");
        defualtContact3.put("Street Address", "Lundsgatan");
        defualtContact3.put("Street Number", "3");
        defualtContact3.put("Country", "Norge");
        defualtContact3.put("Zip Code", "97543");

        phoneBook.add(defualtContact1);
        phoneBook.add(defualtContact2);
        phoneBook.add(defualtContact3);
    }

    public Contact createContact() {
        Contact contactInfo = new Contact.ContactBuilder("Marcus", "Groth",
                2, "4535353", "2", "Skolvägen", "Sweden", "94567")
                .fName()
                .lName()
                .age()
                .phoneNo()
                .streetAddress()
                .streetNum()
                .county()
                .zipCode()
                .build();

        return contactInfo;
    }

    public LinkedHashMap<String, String> contactHashMap() {
        Contact contactInfo = createContact();

        LinkedHashMap<String, String> contact = new LinkedHashMap<>();
        contact.put("First Name", contactInfo.getFirstName());
        contact.put("Last Name", contactInfo.getLastName());
        contact.put("Age", contactInfo.getAge());
        contact.put("Phone", contactInfo.getPhoneNo());
        contact.put("Street Address", contactInfo.streetAddress);
        contact.put("Street Number ", contactInfo.streetNum);
        contact.put("Country", contactInfo.county);
        contact.put("Zip Code", contactInfo.zipCode);

        return contact;
    }


    public void printAllContacts() {
        System.out.println();
        for (int i = 0; i < phoneBook.size(); i++) {
            LinkedHashMap<String, String> contact = phoneBook.get(i);
            System.out.println(contact);
        }
    }


    @Override
    public void addContact() {
        LinkedHashMap<String, String> contact = contactHashMap();

        for (int i = 0; i < phoneBook.size(); i++) {

            if (contact.get("Phone").equals(phoneBook.get(i).get("Phone"))) {
                System.out.println("""
                        You have enter a Phone number that already is in the Phonebook
                        Please write a different number
                        """);
                System.out.println("Phone:");
                contact.put("Phone", sc.next());

            }
        }

        phoneBook.add(contact);
    }


    public void searchByLastName() {
        System.out.print("Enter a Last Name: ");
        String userInput = sc.next();

        for (LinkedHashMap<String, String> contact : phoneBook) {
            int i = 1;
            if (userInput.equals(contact.get("Last Name"))) {
                System.out.println(contact);
            }
        }
    }

    public void searchByFirstName() {
        System.out.print("Enter a First Name: ");
        String userInput = sc.next();

        for (LinkedHashMap<String, String> contact : phoneBook) {
            int i = 1;
            if (userInput.equals(contact.get("First Name"))) {
                System.out.println(contact);
            }
        }
    }

    public void searchByAdress() {
        System.out.print("Enter a Street Address: ");
        String userInput = sc.next();

        for (LinkedHashMap<String, String> contact : phoneBook) {
            int i = 1;
            if (userInput.equals(contact.get("Street Address"))) {
                System.out.println(contact);
            }
        }
    }

    public void freeSearch() {
        System.out.print("Free Search: ");
        String userInput = sc.next();
        int letters = userInput.length();
        int position = 0;
        List<String> s = Arrays.asList("First Name", "Last Name", "Age", "Phone", "Street Address", "Country", "Zip Code");

        for (int i = 0; i < s.size(); i++) {

            for (LinkedHashMap<String, String> contact : phoneBook) {
                String itemInHashMap = contact.get(s.get(i));

                try {
                    if (userInput.equals(itemInHashMap.substring(0, letters))) {
                        position++;
                        System.out.println("Profile " + position + ": " + contact);
                    }
                } catch (StringIndexOutOfBoundsException e) {
                }
            }

        }

        System.out.print("Choice Profile: ");
        int userChoice = sc.nextInt();
    }

    public void printProfile() {
        List<String> s = Arrays.asList("First Name", "Last Name", "Age", "Phone", "Street Address", "Country", "Zip Code");

        for (int i = 0; i < s.size(); i++) {
            HashMap<String, String> contact = phoneBook.get(0);
            System.out.println(s.get(i) + ": " + contact.get(s.get(i)));
        }

        System.out.println(); // newLine

    }

    @Override
    public void readContact() {

    }

    @Override
    public void readAll() {

    }


    @Override
    public void updateContact() {

    }

    @Override
    public void deleteContact() {

    }
}






