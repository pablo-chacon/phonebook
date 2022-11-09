import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String title;
    private List<String> options;

    public Menu(String title, List<String> options) {
        this.title = title;
        this.options = options;

        for (int i = 0; i < options.size(); i++) {
            String option = options.get(i);
            System.out.println("[" + (i + 1) + "] " + option);
        }
    }

    public void printMenu() {

    }
}
