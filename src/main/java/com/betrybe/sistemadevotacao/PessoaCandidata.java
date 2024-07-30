package com.betrybe.sistemadevotacao;

/**
 * Abstract class for a candidate.
 */
public class PessoaCandidata extends Pessoa {
  public int numero;
  public int votos;

  /**
   * Constructor pro candidato.
   *
   * @param nome - nome do candidato
   * @param numero - número do candidato
   */
  public PessoaCandidata(String nome, int numero) {
    this.nome = nome;
    this.numero = numero;
    this.votos = 0;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void receberVoto() {
    this.votos++;
  }
}
