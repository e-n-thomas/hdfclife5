import java.util.List;
import java.util.stream.Collectors;


public class StreamApis {
    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public static List<String> getDevelopers(List<Employee> employees){
        return employees.stream()
                .filter(e -> e.getRole().equals("Developers"))
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

    public static long getStatsWithA(List<String> words){
        return words.stream()
                .filter(w -> w.startsWith("A"))
                .count();
    }

    public static List<Integer> getUnique(List<Integer> list){
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}