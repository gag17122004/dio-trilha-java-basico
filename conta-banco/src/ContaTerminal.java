public class ContaTerminal {
    public static void main(String[] args) {
        // Variáveis de saldo e valor solicitado
        double saldo = 25.0;
        double valorSolicitado = 18.0;

        // Verifique se o saldo é maior que o valor solicitado
        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado; // Subtrai o valor solicitado do saldo
        } else {
            System.out.println("Saldo insuficiente");
        }

        // Imprima o valor do saldo
        System.out.println("Saldo atual: " + saldo);

        // Repita o processo com novos valores
        saldo = 15.0;
        valorSolicitado = 22.0;

        // Verifique se o saldo é maior que o valor solicitado
        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado; // Subtrai o valor solicitado do saldo
        } else {
            System.out.println("Saldo insuficiente");
        }

        // Imprima o valor do saldo
        System.out.println("Saldo atual: " + saldo);
    }
}
