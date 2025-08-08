import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
//        List<Integer> evenNumbers = StreamApis.getEvenNumbers(numbers);
//        System.out.println(evenNumbers);
//
//        List<Employee> employees = Arrays.asList(
//                new Employee("Alice", "Developers",100000),
//                new Employee("Bob", "Testers",200000),
//                new Employee("Charlie", "Developers",30000)
//        );
//        List<String> developers = StreamApis.getDevelopers(employees);
//        System.out.println(developers);
//
//        List<String> words = Arrays.asList("Apple", "Banana", "Africa");
//        long num = StreamApis.getStatsWithA(words);
//        System.out.println("Number of words starting with A: "+num);
//
//        List<Employee> sorted = StreamApis.sortEmployee(employees);
//        for (Employee e : sorted) {
//            System.out.print(e.getName()+" ");
//        }
//        System.out.println(ExceptionHandling.div(10,0));

        BankAccount acc1 = new BankAccount(1,"ABC DEF",123456,100000.00);
        BankAccountServiceImpl bank = new BankAccountServiceImpl();
        System.out.println("Balance is: $"+bank.checkBalance(acc1));
        double amount = 1000000.0;
        System.out.println("Withdrawing amount: $"+amount);
        System.out.println("Balance: $"+bank.withdrawAmount(acc1,amount));
        System.out.println("Depositing amount: $"+amount);
        System.out.println("Balance: $"+bank.depositAmount(acc1,amount));


    }


    }
