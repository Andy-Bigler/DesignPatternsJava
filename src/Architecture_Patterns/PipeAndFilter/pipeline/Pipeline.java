package Architecture_Patterns.PipeAndFilter.pipeline;

import Architecture_Patterns.PipeAndFilter.filter.Filter;

public class Pipeline<I, O> {
    private final Filter<I, O> currentFilter;

    public Pipeline(Filter<I, O> currentFilter) {
        this.currentFilter = currentFilter;
    }

    public <K> Pipeline<I, K> addFilter(Filter<O, K> nextFilter) {
        return new Pipeline<> (input -> nextFilter.execute(currentFilter.execute(input)));
    }

    public O execute(I input) {
        return currentFilter.execute(input);
    }
}
