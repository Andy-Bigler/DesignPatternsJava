package Architecture_Patterns.Repository;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public List<String> strings = new ArrayList<>();
    private static Database database = null;

    private Database() { }

    public static Database getInstance() {
        if (database == null)
            database = new Database();

        return database;
    }
}
