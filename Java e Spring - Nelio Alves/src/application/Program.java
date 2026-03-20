package application;

import entities.Employee;
import services.PensionService;
import services.SalaryService;
import services.TaxService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.printf("Nome:");
        String name = sc.nextLine();
        System.out.printf("Salário bruto:");
        double grossSalary = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary);
        SalaryService salaryService = new SalaryService();

        double netSalary = salaryService.netSalary(employee);
        System.out.printf("Salário Líquido = %.2f%n", netSalary);


        sc.close();
    }
}
