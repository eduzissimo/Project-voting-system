package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Main class.
 */
public class Principal {

  /**
   * Só pro Javadoc parar de dar erro.
   */
  public static void main(String[] args) {
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);
    int opcao;

    while (true) {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.print("Entre com o número correspondente à opção desejada: ");
      opcao = Integer.parseInt(scanner.nextLine());

      if (opcao == 2) {
        break;
      }

      System.out.print("Entre com o nome da pessoa candidata: ");
      String nome = scanner.nextLine();
      System.out.print("Entre com o número da pessoa candidata: ");
      int numero = scanner.nextInt();
      scanner.nextLine();

      gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
    }

    while (true) {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.print("Entre com o número correspondente à opção desejada: ");
      opcao = Integer.parseInt(scanner.nextLine());

      if (opcao == 2) {
        break;
      }

      System.out.print("Entre com o nome da pessoa eleitora: ");
      String nome = scanner.nextLine();
      System.out.print("Entre com o CPF da pessoa eleitora: ");
      String cpf = scanner.nextLine();

      gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
    }

    while (true) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      System.out.print("Entre com o número correspondente à opção desejada: ");
      opcao = Integer.parseInt(scanner.nextLine());

      if (opcao == 1) {
        System.out.print("Entre com o CPF da pessoa eleitora: ");
        String cpf = scanner.nextLine();
        System.out.print("Entre com o número da pessoa candidata: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        gerenciamentoVotacao.votar(cpf, numero);
      } else if (opcao == 2) {
        gerenciamentoVotacao.mostrarResultado();
      } else if (opcao == 3) {
        gerenciamentoVotacao.mostrarResultado();
        break;
      }
    }

    scanner.close();
  }
}