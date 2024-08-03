import tipoContas.Conta;
import tipoContas.ContaCorrente;
import tipoContas.ContaPoupanca;
import utils.ContaUtils;

public class Main {
    public static void main(String[] args) {
        Conta conta = new ContaPoupanca(2000.0);

        conta.extrato();
        conta.mostrarDados();

        System.out.println();
        conta.depositar(1000.0);

        System.out.println();
        conta.sacar(2000.0);

        System.out.println();
        conta.transferencia(1000.0, new ContaPoupanca(4000.0));
    }
}