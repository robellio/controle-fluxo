package com.expo.contador;

import com.expo.contador.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");

        int parametroum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();
        scanner.nextLine();

        try {
            contar(parametroum, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        } finally {
            scanner.close();
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O Segundo Parâmetro deve ser maior que o Primeiro");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }

}
