package Architecture_Patterns.PipeAndFilter.filter;

public interface Filter<I, O> {
    O execute(I input);
}