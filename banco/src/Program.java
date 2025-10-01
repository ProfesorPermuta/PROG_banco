import java.util.Scanner;

public class Program {

    final static int OP_INGRESA = 1, OP_RETIRA = 2, OP_SALDO = 3, OP_SALIR = 4;

    public static void main(String[] args) {

        CuentaBancaria cb = new CuentaBancaria();

        while (true){
            System.out.println("Introduce tu acción.");
            System.out.println("\t1. Ingresa");
            System.out.println("\t2. Retira");
            System.out.println("\t3. Saldo");
            System.out.println("\t4. Salir");

            Scanner sc = new Scanner(System.in);
            int opcionUsuario = sc.nextInt();
            double saldo = 0;
            if(opcionUsuario == OP_INGRESA){
                System.out.println("Introduce el dinero a ingresar:");
                double ingreso = sc.nextDouble();
                saldo = cb.ingresarDinero(ingreso);
            }
            if(opcionUsuario == OP_RETIRA){
                System.out.println("Introduce el dinero a retirar:");
                double ingreso = sc.nextDouble();
                saldo = cb.retirarDinero(ingreso);
                if(saldo == -1){
                    System.err.println("Saldo insuficiente");
                }
            }
            if(opcionUsuario == OP_SALDO){
                saldo = cb.getSaldo();
            }
            if(opcionUsuario == OP_SALIR){
                System.out.println("Adios, gracias por tu dinero");
                break;
            }

            System.out.println("El saldo actual es: " + saldo);
        }

    }
}
