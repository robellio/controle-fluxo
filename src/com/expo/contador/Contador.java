package com.expo.contador;

import com.expo.contador.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar){
            System.out.println("\n===== Comparação =====");
            System.out.println("Digite o primeiro parâmetro ou sair para encerrar:");

            String dadosRecebidos = scanner.nextLine();

            if (dadosRecebidos.equalsIgnoreCase("sair")){
                continuar = false;
                continue;
            }

            try {
                int parametroUm = Integer.parseInt(dadosRecebidos);
                System.out.println("Digite o Segundo Parâmetro:");
                int parametroDois = Integer.parseInt(scanner.nextLine());

                contar(parametroUm, parametroDois);

            } catch (NumberFormatException e) {
                System.out.println("Número inválido! Digite números inteiros.");
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("O Programa foi encerrado.");
        scanner.close();

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
