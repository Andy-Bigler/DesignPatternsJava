package Architecture_Patterns.PipeAndFilter.filter;

public class ConvertToCharArrayFilter implements Filter<String, char[]> {
    @Override
    public char[] execute(String input) {
        return input.toCharArray();
    }
}
