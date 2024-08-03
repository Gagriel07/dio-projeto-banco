package utils;

import java.util.Random;

public class ContaUtils {

    public static String criarNumeroConta() {
        StringBuilder numeroConta = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < 8; i++) {
            numeroConta.append(String.valueOf(random.nextInt(9)));
        }
        return numeroConta.toString();
    }

    public static String criarNumeroAgencia() {
        StringBuilder numeroAgencia = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < 4; i++) {
            numeroAgencia.append(String.valueOf(random.nextInt(9)));
        }
        return numeroAgencia.toString();
    }
}
