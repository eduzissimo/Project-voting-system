package com.betrybe.sistemadevotacao;

/**
 * Abstract class for a voter.
 */
public class PessoaEleitora extends Pessoa {
  private String cpf;

  /**
   * Constructor for the voter.
   *
   * @param nome - voter's name
   * @param cpf - voter's CPF
   */
  public PessoaEleitora(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
