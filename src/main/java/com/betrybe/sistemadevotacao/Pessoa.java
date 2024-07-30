package com.betrybe.sistemadevotacao;

/**
 * Abstract class for a person.
 */
public abstract class Pessoa {
  protected String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
