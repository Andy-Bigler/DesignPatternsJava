package Architecture_Patterns.PipeAndFilter.filter;

public class RemoveAlphabetsFilter implements Filter<String, String> {
    @Override
    public String execute(String input) {
        return input.replaceAll("[a-zA-Z]", "");
    }
}
