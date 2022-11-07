package contactDB;//Interface Database.
import java.util.List;

public interface DataBase<Contact> {

    Contact getContact(long id);

    List<Contact> getAll();

    Contact addContact(Contact contact);

    void update(Contact contact, String[] params);

    void delete(Contact contact);
}