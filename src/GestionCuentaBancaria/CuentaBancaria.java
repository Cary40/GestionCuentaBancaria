/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionCuentaBancaria;

import java.util.Scanner; // Importa la clase Scanner para la entrada de datos por parte del usuario.

/**
 * La clase CuentaBancaria representa un sistema simple de Gestión De Cuentas Bancarias.
 * Permite a los usuarios consultar su saldo, retirar y depositar dinero en su cuenta.
 * 
 * @author Carina A. Nasif
 */
public class CuentaBancaria {

    /**
     * Este es el método principal que inicia el programa y gestiona la interacción con el usuario.
     * Permite  seleccionar opciones para consultar saldo, retirar o depositar dinero.
     * 
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        
        // Adicionar los datos del cliente
        String nombre = "Tony Stark"; // Nombre del cliente
        String tipoDeCuenta = "Corriente"; // Tipo de cuenta del cliente
        double saldo = 1599.99; // Saldo inicial de la cuenta
        int opcion = 0; // Variable para almacenar la opción seleccionada por el usuario. Inicializada en 0.

        System.out.println("*****************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: " + saldo);
        System.out.println("\n*****************************************");

        // Fin de la primera parte Iniciando los valores de la cuenta
        String menu = """
                ** Escriba el número de la opción deseada **
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        // Bucle que muestra el menú hasta que el usuario elige salir
        try (Scanner teclado = new Scanner(System.in) // Inicializa  la clase Scanner para la entrada del usuario
        ) {
            // Bucle que muestra el menú hasta que el usuario elige salir
            while (opcion != 9) {
                System.out.println(menu);
                opcion = teclado.nextInt(); // Captura la opción seleccionada por el usuario
                
                // Con estructura switch se procesa la opción seleccionada por el usuario
                switch (opcion){
                    // Visualizar Saldo
                    case 1 -> System.out.println("El saldo actualizado es: " + saldo + " $");
                    // Hacer Un Retiro
                    case 2 -> {
                        System.out.println("Cuál es el valor que deseas retirar?");
                        double valorARetirar = teclado.nextDouble(); // Captura el valor a retirar
                        if (valorARetirar > saldo){
                            System.out.println("Saldo insuficiente"); // Mensaje si el saldo es insuficiente
                        } else {
                            saldo = saldo - valorARetirar; // Actualiza el saldo
                            System.out.println("Saldo restante: " + saldo + " $");
                        }
                    }
                    // Hacer Un Depósito
                    case 3 -> {
                        System.out.println("Cuál es el valor que vas a depositar?");
                        double valorADepositar = teclado.nextDouble(); // Captura el valor a depositar
                        saldo += valorADepositar; // Actualiza el saldo
                        System.out.println("El saldo actualizado es: " + saldo + " $");
                    }
                    case 9 -> System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                    default -> System.out.println("Opción inválida"); // Mensaje si la opción es inválida
                }
            }
          
        }
        
    }
}