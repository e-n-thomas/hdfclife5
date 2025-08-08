import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evenNumbers = StreamApis.getEvenNumbers(numbers);
        System.out.println(evenNumbers);

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Developers"),
                new Employee("Bob", "Testers"),
                new Employee("Charlie", "Developers")
        );
        List<String> developers = StreamApis.getDevelopers(employees);
        System.out.println(developers);

        List<String> words = Arrays.asList("Apple", "Banana", "Africa");
        long num = StreamApis.getStatsWithA(words);
        System.out.println("Number of words starting with A: "+num);



    }
}