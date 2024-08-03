package tipoContas;

import utils.ContaUtils;

public class ContaPoupanca extends Conta {

    private final String TIPO_CONTA = "POUPANÇA";
    private final String numeroConta;
    private final String agencia;
    private Double saldo;

    public ContaPoupanca(Double saldo) {
        this.saldo = saldo;
        this.agencia = ContaUtils.criarNumeroAgencia();
        this.numeroConta = ContaUtils.criarNumeroConta();
    }

    @Override
    public void depositar(Double deposito) {
        if(deposito == null) {
            throw new RuntimeException("Valor do depósito não pode ser nulo");
        }

        saldo += deposito;
        System.out.println("Depósito realizado com sucesso!");
        extrato();
    }

    @Override
    public void sacar(Double saque) {
        if(saque == null) {
            throw new RuntimeException("Valor do saque não pode ser nulo");
        }

        if(saque > saldo) {
            System.out.println("O valor do saque é maior que o valor do seu saldo!");
            System.out.println("Operação cancelada");
            extrato();
        } else {
            saldo -= saque;
            System.out.println("Saque realizado com sucesso!");
            extrato();
        }
    }

    @Override
    public void transferencia(Double valor, Conta conta) {
        if(valor == null || conta == null) {
            throw new RuntimeException("Valor da transferencia ou da conta não pode ser nulo");
        }

        if(valor == 0.0) {
            System.out.println("O valor da transferencia não pode ser 0.0!");
            System.out.println("Operação cancelada");
        }

        saldo -= valor;
        System.out.println("Valor R$" + valor + " transferido com sucesso");
        extrato();
    }

    @Override
    public void extrato() {
        System.out.println("Extrato: " + getSaldo());
    }

    public void mostrarDados() {
        System.out.println("Conta " + getTipoConta());
        System.out.println("Agência " + getAgencia());
        System.out.println("Agência " + getNumeroConta());
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return this.TIPO_CONTA;
    }
}
