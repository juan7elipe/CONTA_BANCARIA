package br.unipar;

import java.util.UUID;

abstract class HerancaContaBancaria implements InterfaceContaBancaria {

    protected double saldo;
    private String numero_conta;

    public HerancaContaBancaria() {
        saldo = 0d;
        numero_conta = UUID.randomUUID().toString();
    }

    @Override
    public double obter_saldo() {
        return saldo;
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public String retornar_numero_conta() {
        return numero_conta;

    }
}