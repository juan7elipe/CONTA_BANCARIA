package br.unipar;

public class Main {
    public static void main(String[] args) {

        ContaCorrente conta_corrente = new ContaCorrente();
        conta_corrente.depositar(1000d);

        System.out.println("Saldo: " + conta_corrente.obter_saldo());
        System.out.println("Número da conta:" + conta_corrente.retornar_numero_conta());
        

    }
}
