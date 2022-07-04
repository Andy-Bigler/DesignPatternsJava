package Architecture_Patterns.Repository;

public class Controller {
    public static void main(String[] args) {
        var repository = new Repository();
        repository.add("Hey hey");
        repository.add("Hello");

        var newRepo = new Repository();
        newRepo.remove("Hello");

        System.out.println(newRepo.getAll());
    }
}
