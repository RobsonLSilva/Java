package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee funcionario = new Employee();

        System.out.println("Digite o nome do funcionário:");
        funcionario.name = sc.nextLine();

        System.out.println("Digite o salário bruto do funcionário:");
        funcionario.grossSalary = sc.nextDouble();

        System.out.println("Digite o valor do imposto para subtrair do  salário:");
        funcionario.tax = sc.nextDouble();

        System.out.printf("\nNome: %s\n", funcionario.name);
        System.out.printf("Salário Bruto: $ %.2f\n", funcionario.grossSalary);
        System.out.printf("Imposto: $ %.2f\n", funcionario.tax);

        System.out.println("\nFuncionário: " + funcionario);

        System.out.println("\nQual a porcentagem de aumento do salário?");
        double percentual = sc.nextDouble();
        funcionario.IncreaseSalary(percentual);

        System.out.println("\nAtualização de dados: " + funcionario);

        sc.close();

    }
    
}