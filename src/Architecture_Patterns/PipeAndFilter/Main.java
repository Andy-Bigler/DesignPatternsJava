package Architecture_Patterns.PipeAndFilter;

import java.util.Scanner;

import Architecture_Patterns.PipeAndFilter.filter.ConvertToCharArrayFilter;
import Architecture_Patterns.PipeAndFilter.filter.RemoveAlphabetsFilter;
import Architecture_Patterns.PipeAndFilter.filter.RemoveDigitsFilter;
import Architecture_Patterns.PipeAndFilter.pipeline.Pipeline;

public class Main {
    public static void main(String[] args) {
        var filters = new Pipeline<>(new RemoveAlphabetsFilter())
                .addFilter(new RemoveDigitsFilter())
                .addFilter(new ConvertToCharArrayFilter());;

        System.out.println("Welcome to the special chars pipeline!");
        System.out.println("------------------------------------");

        try (var scanner = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            while (scanner.hasNext()) {
                var input = scanner.next();
                var output = filters.execute(input);
                if (output.length == 0) {
                    System.out.println("No special chars found!");
                } else {
                    System.out.println("Special chars found: ");
                    for (var c : output) {
                        System.out.print(c);
                    }
                    System.out.println();
                }
                System.out.println("Enter a string: ");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
