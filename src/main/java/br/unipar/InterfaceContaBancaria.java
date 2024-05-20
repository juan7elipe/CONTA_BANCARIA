package br.unipar;

public interface InterfaceContaBancaria {

    double obter_saldo();
    void depositar(Double valor);
    String retornar_numero_conta();
    boolean saque(Double valor);




}
