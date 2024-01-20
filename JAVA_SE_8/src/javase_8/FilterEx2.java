package javase_8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class FilterEx2 {

    public static void main(String[] args) {
        // Create a list of Emp objects
        List<Emp> emps = Arrays.asList(new Emp(10, "achuth"), new Emp(20, "jagath"), new Emp(30, "ejaz"));

        // Filter and print employees with eid greater than 10
        emps.stream().filter(emp -> emp.eid > 10).forEach(emp -> System.out.println(emp.eid + " ," + emp.name));

        // Filter the data and collect it into a list
        List<Emp> e = emps.stream().filter(emp -> emp.eid > 10).collect(Collectors.toList());

        // Print the filtered employees from the list
        e.forEach(emp -> System.out.println(emp.eid + " ," + emp.name));

        // Filter the data and collect it into a set (employees with names starting with "a")
        Set<Emp> es = emps.stream().filter(emp -> emp.name.startsWith("a")).collect(Collectors.toSet());

        // Print the filtered employees from the set
        es.forEach(emp -> System.out.println(emp.eid + " ," + emp.name));

        // Find the first employee with eid greater than 10
        Emp ee = emps.stream().filter(emp -> emp.eid > 10).findFirst().get();

        // Print the first matching employee
        System.out.println(ee.eid + " " + ee.name);

        // Handling a case where no matching element is found
        Emp e1 = emps.stream().filter(emp -> emp.eid > 40).findFirst().orElse(null);

        // Check if a matching employee was found and print the result
        if (e1 == null)
            System.out.println(e1);
        else
            System.out.println(e1.eid + " " + e1.name);

        // Find the nth element (in this case, the second element) with eid greater than 10
        Emp eee = emps.stream().filter(emp -> emp.eid > 10).skip(1).findFirst().get();

        // Print the second matching employee
        System.out.println(eee.eid + " " + eee.name);
    }
}