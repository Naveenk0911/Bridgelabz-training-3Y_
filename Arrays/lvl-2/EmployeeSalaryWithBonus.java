

import java.util.Scanner;

class EmployeeSalarywithBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        int[] years = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        
        double totalSalary = 0, totalBonus = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i+1) + ": ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter years of service of employee " + (i+1) + ": ");
            years[i] = sc.nextInt();

            if (salary[i] <= 0) {
                System.out.println("Invalid salary! Try again.");
                i--;
                continue;
            }

            if (years[i] > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }

            newSalary[i] = salary[i] + bonus[i];
            totalSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        
        System.out.println("\nEmployee Salary Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i+1) + 
                               " | Salary: " + salary[i] +
                               " | Bonus: " + bonus[i] +
                               " | New Salary: " + newSalary[i]);
        }

        System.out.println("\nTotal Salary: " + totalSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
        sc.close();
    }
}