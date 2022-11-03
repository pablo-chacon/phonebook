package contactDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ContactDB implements Crud {

    String contactInput;
    List<List<String>> contact = new ArrayList<>();
    List<Integer> maxLengths = new ArrayList<>();
    int numColumns = -1;

    public ContactDB addContact(String... contact) {

        if (numColumns == -1){
            numColumns = contact.length;
            for(int column = 0; column < numColumns; column++) {
                maxLengths.add(0);
            }
        }

        if (numColumns != contact.length) {
            throw new IllegalArgumentException();
        }

        for(int column = 0; column < numColumns; column++) {
            int length = Math.max(maxLengths.get(column), contact[column].length());
            maxLengths.set( column, length );
        }
        this.contact.add( Arrays.asList(contact) );
        return this;
    }


    /*public void readAll() {
        for (int i = 0; i <= contact.size(); i++) {
            System.out.println(i);
        }
    }*/

    public String toString(){
        String result = "";
        for(List<String> line : contact) {
            for(int i = 0; i < numColumns; i++) {
                result += pad( line.get(i), maxLengths.get(i) + 1 );
            }
            result += System.lineSeparator();
        }
        return result;
    }

    private String pad(String word, int newLength){
        while (word.length() < newLength) {
            word += " ";
        }
        return word;
    }


    public ContactDB() {
        super();
    }

    public void addContact() {
        addContact();
    }

    public abstract void readContact();

    @Override
    public void readAll() {
        for (int i = 0; i <= contact.size(); i++) {
            System.out.println(i);
        }
    }


    public void readContact(String search) {
        System.out.println(contact.contains(search));
    }

    public void updateContact() {
        System.out.println(" ");
    }

    public void deleteContact() {
        // Remove defined contact.
        contact.remove(contact);
        System.out.println(contact + "removed.");
    }
}