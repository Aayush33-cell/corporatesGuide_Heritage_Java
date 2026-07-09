package finalAssessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Employee class to store employee details
class Employee {
    int id;
    String name;
    int score;

    Employee(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
}

public class EmployeeRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Employee> employees = new ArrayList<>();

        // reading employee records
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int score = sc.nextInt();
            employees.add(new Employee(id, name, score));
        }

        // calculating average score
        double total = 0;
        for (int i = 0; i < employees.size(); i++) {
            total = total + employees.get(i).score;
        }
        double average = total / n;

        // finding highest and lowest scorer
        Employee highest = employees.get(0);
        Employee lowest = employees.get(0);

        for (int i = 1; i < employees.size(); i++) {
            if (employees.get(i).score > highest.score) {
                highest = employees.get(i);
            }
            if (employees.get(i).score < lowest.score) {
                lowest = employees.get(i);
            }
        }

        // printing average, highest and lowest
        System.out.printf("Average Score: %.2f\n", average);
        System.out.println("Highest Scorer: " + highest.name + " " + highest.score);
        System.out.println("Lowest Scorer: " + lowest.name + " " + lowest.score);

        // finding qualified employees (score >= average)
        ArrayList<Employee> qualified = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).score >= average) {
                qualified.add(employees.get(i));
            }
        }

        // sorting qualified employees - highest score first, if same then alphabetically
        Collections.sort(qualified, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                if (e2.score != e1.score) {
                    return e2.score - e1.score;
                } else {
                    return e1.name.compareTo(e2.name);
                }
            }
        });

        // printing qualified employees
        System.out.println("Qualified Employees:");
        for (int i = 0; i < qualified.size(); i++) {
            System.out.println(qualified.get(i).name + " " + qualified.get(i).score);
        }

        sc.close();
    }
}
