package Architecture_Patterns.Repository;

import java.util.List;

public class Repository {
    private final Database db;

    public Repository() {
       db = Database.getInstance();
    }

    public void add(String string) {
         db.strings.add(string);
    }

    public boolean remove(String string) {
         return db.strings.remove(string);
    }

    public List<String> getAll() {
         return db.strings;
    }
}
