package Architecture_Patterns.PipeAndFilter.filter;

public class RemoveDigitsFilter implements Filter<String, String> {
    @Override
    public String execute(String input) {
        return input.replaceAll("[0-9]", "");
    }
}
