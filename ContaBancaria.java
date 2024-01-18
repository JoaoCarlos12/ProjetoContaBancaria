import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = "João Carlos";
        String conta = "corrente";
        double saldo = 2500;
        double valor;
        int opc;
        System.out.println("***************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println();
        System.out.println("nome:               " + nome);
        System.out.println("Tipo conta:         " + conta);
        System.out.println("Saldo inicial:      R$ " + saldo);
        System.out.println("***************************************");
        System.out.println();
        do {
            System.out.println("Operações");
            System.out.println("1 - Consultar dados");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println();
            System.out.println("Digite a opção desejada: ");
            opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Saldo atual R$ " + saldo);
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Informe o valor que deseja receber: ");
                    valor = entrada.nextInt();
                    saldo += valor;
                    System.out.println("Saldo atualizado R$ " + saldo);
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Informe o valor que deseja transferir: ");
                    valor = entrada.nextInt();
                    if(valor > saldo){
                        System.out.println("Transferencia invalida");
                        System.out.println();
                        break;
                    }
                    saldo -= valor;
                    System.out.println("Saldo atualizado R$ " + saldo);
                    System.out.println();
                    break;
                default:
                    if(opc > 4) {
                        System.out.println("Opção invalida!!");
                        System.out.println();
                    }
            }
        }while(opc != 4);
    }
}
