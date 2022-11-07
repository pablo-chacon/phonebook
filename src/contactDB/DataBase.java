package contactDB;//Interface Database.
import java.util.List;

public interface DataBase<Contact> {

    Contact getContact(int id);

    List<Contact> getAll();

    Contact addContact(Contact contact);

    void update(Contact contact, String[] params);

    void delete(Contact contact);
}