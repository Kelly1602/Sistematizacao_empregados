package br.com.mgs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Alergias: ");
        String alergias = scanner.nextLine();

        System.out.print("Problemas Médicos: ");
        String problemasMedicos = scanner.nextLine();

        System.out.print("Telefone de Contato: ");
        String telefoneContato = scanner.nextLine();
        System.out.print("Email de Contato: ");
        String emailContato = scanner.nextLine();

        Empregado empregado = new Empregado(id, nome, idade, alergias, problemasMedicos, telefoneContato, emailContato);
        System.out.println("Dados do Empregado:");
        System.out.println(empregado);

        scanner.close();
    }
}
