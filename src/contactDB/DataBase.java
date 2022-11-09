package contactDB;//Interface Database.
import java.util.List;

public interface DataBase<Contact> {

    Contact getContact(int id);

    List<Contact> getAll();

    void addContact();

    void update(Contact contact);

    void delete(Contact contact);
}